package Connection;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SQLite implements IDataBase {

    public String url = "jdbc:sqlite:";
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public SQLite() throws IOException, SQLException {
        Create();
    }

    public void Create() throws IOException, SQLException {
        File folder = new File("DataBase");
        File database = new File("DataBase/english.db");

        if (folder.exists() == false) {
            folder.mkdir();
        }
        if (database.exists() == false) {
            database.createNewFile();
        }

        this.url = "jdbc:sqlite:" + database.getCanonicalPath();
    }

    public void CreateTables() throws SQLException {
        try {
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();
            statement.execute("CREATE TABLE \"words\" (\n"
                    + "\t\"Id\"\tINTEGER NOT NULL UNIQUE,\n"
                    + "\t\"english\"\tTEXT NOT NULL UNIQUE,\n"
                    + "\t\"turkish\"\tTEXT NOT NULL,\n"
                    + "\t\"forgotten\"\tINTEGER NOT NULL DEFAULT 0,\n"
                    + "\t\"date_of_addition\"\tTEXT DEFAULT NULL,\n"
                    + "\tPRIMARY KEY(\"Id\" AUTOINCREMENT)\n"
                    + ");");
            System.out.println("Words tablosu eklendi");

            statement.execute("CREATE TABLE \"learned\" (\n"
                    + "\t\"Id\"\tINTEGER NOT NULL UNIQUE,\n"
                    + "\t\"english\"\tTEXT NOT NULL UNIQUE,\n"
                    + "\t\"turkish\"\tTEXT NOT NULL,\n"
                    + "\t\"date_of_addition\"\tTEXT DEFAULT NULL,\n"
                    + "\tPRIMARY KEY(\"Id\" AUTOINCREMENT)\n"
                    + ");");
            System.out.println("learned tablosu eklendi");

            statement.execute("CREATE TABLE \"forgotten_date\" (\n"
                    + "\t\"Id\"\tINTEGER NOT NULL,\n"
                    + "\t\"words_id\"\tTEXT DEFAULT NULL,\n"
                    + "\t\"forgotten_date\"\tTEXT DEFAULT NULL,\n"
                    + "\tPRIMARY KEY(\"Id\" AUTOINCREMENT)\n"
                    + ");");
            System.out.println("Forgotten tablosu eklendi");

        } catch (SQLException exception) {
            System.out.println("Error!");
            System.out.println(exception.getMessage());
        } finally {
            connection.close();
            statement.close();
        }
    }

    @Override
    public String addWord(String english, String turkish) throws SQLException {
        String back = "";
        boolean already = false;
        try {
            resultSet = execute("SELECT * FROM learned WHERE english=\"" + english + "\";");
            if (resultSet.next() == true) {

                int Id = resultSet.getInt("Id");
                String date = resultSet.getString("date_of_addition");

                resultSet.close();

                addTo("words", "learned", Id, english, turkish, date);

                back = "This word is already exist in the learned.";
                already = true;

            } else {
                connection = DriverManager.getConnection(url);
                preparedStatement = connection.prepareStatement("INSERT INTO 'words' ('english','turkish','date_of_addition') VALUES (?,?,?)");
                preparedStatement.setString(1, english);
                preparedStatement.setString(2, turkish);
                preparedStatement.setString(3, getDate().toString());
                preparedStatement.execute();
                back = "Added successfully.";
            }

        } catch (SQLException exception) {
            if (exception.getErrorCode() == 19) {
                back = "This word already added.";
                increaseForgotten(english);
                addForgot(getId(english));
            } else {
                System.out.println("Hata");
                System.out.println(exception.getMessage());
                System.out.println("Hata kodu " + exception.getErrorCode());
            }
        } finally {
            if (already == false) {
                connection.close();
                preparedStatement.close();
                resultSet.close();

            }
            return back;
        }
    }

    @Override
    public void showError(SQLException exception) {
        System.out.println("Error : " + exception.getMessage());
        System.out.println("Error Code : " + exception.getErrorCode());
    }

    @Override
    public ArrayList getWords(String table) throws SQLException {
        ArrayList<Words> words = null;
        try {
            words = new ArrayList<Words>();
            connection = DriverManager.getConnection(url);

            String sql;
            if (table == "forgotten_date") {
                sql = "SELECT w.english, w.turkish, w.forgotten, w.date_of_addition, d.forgotten_date FROM words w JOIN forgotten_date d ON d.words_id = w.Id ORDER BY english";
            } else {
                sql = "SELECT * FROM " + table;
            }

            resultSet = connection.createStatement().executeQuery(sql);

            if (table == "words") {
                while (resultSet.next()) {
                    words.add(new Words(resultSet.getInt("Id"), resultSet.getString("english"), resultSet.getString("turkish"), resultSet.getInt("forgotten"), resultSet.getString("date_of_addition").toString()));
                }
            } else if (table == "learned") {
                while (resultSet.next()) {
                    words.add(new Words(resultSet.getInt("Id"), resultSet.getString("english"), resultSet.getString("turkish"), resultSet.getString("date_of_addition")));
                }
            } else {
                while (resultSet.next()) {
                    words.add(new Words(resultSet.getString("english"), resultSet.getString("turkish"), resultSet.getInt("forgotten"), resultSet.getString("date_of_addition").toString(), resultSet.getString("forgotten_date").toString()));
                }
            }

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.getErrorCode());
        } finally {
            connection.close();
            resultSet.close();
        }
        return words;
    }

    @Override
    public String delete(String database, int Id) throws SQLException {
        String back = null;
        try {
            connection = DriverManager.getConnection(url);
            String sql = "DELETE FROM `" + database + "` WHERE (`Id` = '" + Id + "');";
            statement = connection.createStatement();
            statement.execute(sql);
            back = "Deleted.";
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.getErrorCode());
            back = "Could not be deleted.";
        } finally {
            connection.close();
            statement.close();
            return back;
        }

    }

    @Override
    public void update(String database, String english, String turkish, int id) throws SQLException {
        try {
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();
            String sql = "UPDATE `" + database + "` SET `english` = '" + english + "',`turkish` = '" + turkish + "' WHERE (`Id` = '" + id + "');";
            statement.execute(sql);
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.getErrorCode());
        } finally {
            connection.close();
            statement.close();
        }
    }

    @Override
    public void addTo(String where, String from, int id, String english, String turkish, String date) throws SQLException {
        String insertSql = "INSERT INTO `" + where + "` (`english`, `turkish`, `date_of_addition`) VALUES ('" + english + "', '" + turkish + "', '" + date + "');";

        try {
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();
            statement.execute(insertSql);

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.getErrorCode());
        } finally {
            connection.close();
            statement.close();
        }
        delete(from, id);

    }

    @Override
    public ArrayList search(String likeSQL, String table) throws SQLException {
        ArrayList<Words> words = null;
        try {
            words = new ArrayList<Words>();
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();

            String sql;
            if (table == "forgotten_date") {
                sql = "SELECT w.english, w.turkish, w.forgotten, w.date_of_addition, d.forgotten_date FROM words w JOIN forgotten_date d ON d.words_id = w.Id WHERE w.english LIKE '%" + likeSQL + "%' ORDER BY english";
            } else {
                sql = "SELECT * FROM " + table + " WHERE english LIKE '%" + likeSQL + "%'";
            }

            resultSet = statement.executeQuery(sql);

            if (table == "words") {
                while (resultSet.next()) {
                    words.add(new Words(resultSet.getInt("Id"), resultSet.getString("english"), resultSet.getString("turkish"), resultSet.getInt("forgotten"), resultSet.getString("date_of_addition").toString()));
                }
            } else if (table == "learned") {
                while (resultSet.next()) {
                    words.add(new Words(resultSet.getInt("Id"), resultSet.getString("english"), resultSet.getString("turkish"), resultSet.getString("date_of_addition")));
                }
            } else if (table == "forgotten_date") {
                while (resultSet.next()) {
                    words.add(new Words(resultSet.getString("english"), resultSet.getString("turkish"), resultSet.getInt("forgotten"), resultSet.getString("date_of_addition"), resultSet.getString("forgotten_date")));
                }
            }
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.getErrorCode());
        } finally {
            connection.close();
            statement.close();
            resultSet.close();
        }
        return words;
    }

    @Override
    public ArrayList<String> getDaily() throws SQLException, IOException {
        ArrayList<Words> words = getWords("words");
        ArrayList<Integer> components = read();
        ArrayList<String> dailyWords = readToday();
        java.util.Date date = new java.util.Date();

        if (words.isEmpty()) {
            dailyWords.clear();
            for (int i = 0; i < 10; i++) {
                dailyWords.add("");
            }
            return dailyWords;
        } else if (words.size() < 5) {
            dailyWords.clear();
            for (int i = 0; i < 5; i++) {
                dailyWords.add(words.get(i % (words.size())).getEnglish());
                dailyWords.add(words.get(i % (words.size())).getTurkish());
            }
            new File("commands/daily/words.txt").delete();
            new File("commands/daily/components.txt").delete();
            return dailyWords;
        } else if (components.get(0) == date.getDate()) {
            return dailyWords;
        } else {
            dailyWords.clear();

            if (components.get(1) > words.size() - 5) {
                components.clear();
                components.add(date.getDate());
                components.add(0);
            }

            int random = (int) (Math.random() * (words.size()));
            int i = 0;
            while (i != 5) {
                if (isThere(words.get(random), components) == false) {
                    components.set(1, (components.get(1) + 1));
                    components.add(words.get(random).getId());

                    dailyWords.add(words.get(random).getEnglish());
                    dailyWords.add(words.get(random).getTurkish());
                    i++;
                }
                random = (int) (Math.random() * (words.size()));
            }
            components.set(0, date.getDate());
            write(components);
            writeToday(dailyWords);

            return dailyWords;
        }
    }

    public void addForgot(int id) throws SQLException {
        try {
            connection = DriverManager.getConnection(url);
            preparedStatement = connection.prepareStatement("INSERT INTO forgotten_date ('words_id','forgotten_date') VALUES (?,?);");
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, getDate().toString());
            preparedStatement.execute();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } finally {
            connection.close();
            preparedStatement.close();
        }

    }

    public void increaseForgotten(String english) throws SQLException {
        try {
            connection = DriverManager.getConnection(url);
            resultSet = execute("SELECT forgotten FROM words WHERE (\"english\"=\"" + english + "\");");
            resultSet.next();
            int forgotten = resultSet.getInt("forgotten");
            resultSet.close();
            forgotten += 1;

            preparedStatement = connection.prepareStatement("UPDATE words SET \"forgotten\" = " + forgotten + " WHERE (\"english\" = \"" + english + "\");");
            preparedStatement.execute();

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.getErrorCode());
        } finally {
            connection.close();
            preparedStatement.close();
        }
    }

    public void AddLearned(String english) throws SQLException {
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection(url);
            String sql = "SELECT Id FROM words WHERE english=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, english);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            System.out.println(rs.getInt("Id"));

        } catch (SQLException exception) {
            System.out.println("Hata");
            System.out.println(exception.getMessage());
            System.out.println("Hata kodu " + exception.getErrorCode());
        } finally {
            connection.close();
            preparedStatement.close();
        }
    }

    public ResultSet execute(String sql) throws SQLException {
        try {
            statement = DriverManager.getConnection(url).createStatement();
            resultSet = statement.executeQuery(sql);

        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return resultSet;
    }

    public int getId(String english) throws SQLException {
        try {
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT Id FROM words WHERE (\"english\"=\"" + english + "\");");

            resultSet.next();
            return resultSet.getInt("Id");
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        } finally {
            connection.close();
            statement.close();
            resultSet.close();
        }
        return -1;
    }

    public boolean isThere(Words row, ArrayList<Integer> components) {
        int id = row.getId();

        for (int i = 2; i < components.size(); i++) {
            if (components.get(i) == id) {
                return true;
            }
        }

        return false;
    }

    public void writeToday(ArrayList<String> dailyWords) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("commands/daily/words.txt"));
            for (int i = 0; i < dailyWords.size(); i++) {
                bw.write(String.valueOf(dailyWords.get(i)) + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            bw.close();
        }
    }

    public void write(ArrayList<Integer> list) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("commands/daily/components.txt"));
            for (int i = 0; i < list.size(); i++) {
                bw.write(String.valueOf(list.get(i)) + "\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            bw.close();
        }
    }

    public ArrayList<Integer> read() throws FileNotFoundException {
        ArrayList<Integer> list = new ArrayList();
        File f = null;
        Scanner s = null;

        try {
            f = new File("commands/daily/components.txt");
            if (f.exists() == false) {
                new File("commands/daily").mkdir();
                f.createNewFile();
                FileWriter write = new FileWriter(f);
                write.write(String.valueOf(0) + "\n");
                write.write("0 \n");
                write.close();
            }
            s = new Scanner(f);
            while (s.hasNext() != false) {
                list.add(s.nextInt());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            s.close();
        }
        return list;
    }

    public ArrayList<String> readToday() throws IOException {
        ArrayList<String> today = new ArrayList<>();
        File f = new File("commands/daily/words.txt");
        Scanner read = null;
        try {
            if (f.exists() == false) {
                f.createNewFile();
            }
            read = new Scanner(f);

            while (read.hasNext() != false) {
                today.add(read.next());
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return today;
    }

    public java.util.Date getDate() {
        java.util.Date date = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }

}
