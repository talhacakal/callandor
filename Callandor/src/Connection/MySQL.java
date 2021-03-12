package Connection;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class MySQL implements IDataBase {

    private static String userName;
    private static String password;
    private static String dbUrl;

    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private Statement statement;
    private BufferedWriter bw;

    public MySQL() {
        getComponents();
    }

    void getComponents() {
        Scanner read = null;
        try {
            read = new Scanner(new File("commands/components.txt"));
            dbUrl = "jdbc:mysql://" + read.nextLine() + ":" + read.nextLine() + "/english";
            userName = read.nextLine();
            password = read.nextLine();

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            read.close();
        }
    }

    public void Create(String host, String port, String userName, String password) throws IOException {
        File file = null;
        try {
            file = new File("commands/components.txt");

            if (file.exists() == false) {
                new File("commands").mkdir();
                file.createNewFile();
            }

            bw = new BufferedWriter(new FileWriter(file));
            bw.write(host + "\n");
            bw.write(port + "\n");
            bw.write(userName + "\n");
            bw.write(password + "\n");

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        } finally {
            bw.close();
        }

    }

    public boolean isValid(String host, String port, String userName, String password) {
        try {
            DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "", userName, password);
            return true;
        } catch (SQLException exception) {
            return false;
        }
    }

    public void createTables(String host, String port, String userName, String password) throws SQLException {
        Connection connection = null;
        String sql = "CREATE SCHEMA `english` ;";
        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "", userName, password);
            statement = connection.createStatement();

            statement.execute(sql);

            sql = "CREATE TABLE `english`.`words` (\n"
                    + "  `Id` INT NOT NULL AUTO_INCREMENT,\n"
                    + "  `english` VARCHAR(50) NOT NULL,\n"
                    + "  `turkish` VARCHAR(50) NOT NULL,\n"
                    + "  `forgotten` INT NOT NULL DEFAULT '0',\n"
                    + "  `date_of_addition` DATETIME NULL DEFAULT NULL,\n"
                    + "  PRIMARY KEY (`Id`),\n"
                    + "  UNIQUE INDEX `Id_UNIQUE` (`Id` ASC) VISIBLE,\n"
                    + "  UNIQUE INDEX `english_UNIQUE` (`english` ASC) VISIBLE)\n"
                    + "ENGINE = InnoDB\n"
                    + "DEFAULT CHARACTER SET = utf8mb4\n"
                    + "COLLATE = utf8mb4_0900_ai_ci;\n";
            statement.execute(sql);

            sql = "CREATE TABLE `english`.`learned` (\n"
                    + "  `Id` INT NOT NULL AUTO_INCREMENT,\n"
                    + "  `english` VARCHAR(45) NOT NULL,\n"
                    + "  `turkish` VARCHAR(45) NOT NULL,\n"
                    + "  `date_of_addition` DATETIME NULL DEFAULT NULL,\n"
                    + "  PRIMARY KEY (`Id`),\n"
                    + "  UNIQUE INDEX `Id_UNIQUE` (`Id` ASC) VISIBLE,\n"
                    + "  UNIQUE INDEX `english_UNIQUE` (`english` ASC) VISIBLE)\n"
                    + "ENGINE = InnoDB\n"
                    + "DEFAULT CHARACTER SET = utf8mb4\n"
                    + "COLLATE = utf8mb4_0900_ai_ci;\n";
            statement.execute(sql);

            sql = "CREATE TABLE `english`.`forgotten_date` (\n"
                    + "  `Id` INT NOT NULL AUTO_INCREMENT,\n"
                    + "  `words_id` VARCHAR(45) NULL DEFAULT NULL,\n"
                    + "  `forgotten_date` VARCHAR(45) NULL DEFAULT NULL,\n"
                    + "  PRIMARY KEY (`Id`));\n";
            statement.execute(sql);
        } catch (SQLException exception) {
            if (exception.getErrorCode() == 0) {
            } else if (exception.getErrorCode() == 1007) {
            } else {
                showError(exception);
            }
        } finally {
            connection.close();
            statement.close();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);
    }

    @Override
    public String addWord(String english, String turkish) throws SQLException {
        String back = "";
        boolean already = false;
        try {
            if (execute("SELECT * FROM learned WHERE english=\"" + english + "\";").next() == true) {
                resultSet = execute("SELECT * FROM learned WHERE english=\"" + english + "\";");
                resultSet.next();

                addTo("words", "learned", resultSet.getInt("Id"), resultSet.getString("english"), resultSet.getString("turkish"), resultSet.getString("date_of_addition"));
                back = "This word is already exist in the learned.";
                already = true;
                resultSet.close();
            } else {
                String sql = "INSERT INTO words (english,turkish,date_of_addition) VALUES(?,?,?)";
                preparedStatement = getConnection().prepareStatement(sql);
                preparedStatement.setString(1, english);
                preparedStatement.setString(2, turkish);
                preparedStatement.setDate(3, (java.sql.Date) getDate());
                preparedStatement.execute();
                back = "Added successfully.";
            }
        } catch (SQLException exception) {
            if (exception.getErrorCode() == 1062) {
                back = "This word already added.";
                increaseForgotten(english);
                insertFD(english);
            } else if (exception.getErrorCode() == 1406) {
                back = "Data too long.";
            } else {
                showError(exception);
                back = exception.getMessage();
            }
        } finally {
            if (already == false) {
                preparedStatement.close();
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
            statement = getConnection().createStatement();

            String sql;
            if (table == "forgotten_date") {
                sql = "SELECT w.english, w.turkish, w.forgotten, w.date_of_addition, d.forgotten_date FROM words w JOIN forgotten_date d ON d.words_id = w.Id ORDER BY english";
            } else {
                sql = "SELECT * FROM " + table;
            }

            resultSet = statement.executeQuery(sql);

            if (table == "words") {
                while (resultSet.next()) {
                    words.add(new Words(resultSet.getInt("Id"), resultSet.getString("english"), resultSet.getString("turkish"), resultSet.getInt("forgotten"), resultSet.getDate("date_of_addition").toString()));
                }
            } else if (table == "learned") {
                while (resultSet.next()) {
                    words.add(new Words(resultSet.getInt("Id"), resultSet.getString("english"), resultSet.getString("turkish"), resultSet.getDate("date_of_addition").toString()));
                }
            } else {
                while (resultSet.next()) {
                    words.add(new Words(resultSet.getString("english"), resultSet.getString("turkish"), resultSet.getInt("forgotten"), resultSet.getDate("date_of_addition").toString(), resultSet.getDate("forgotten_date").toString()));
                }
            }

        } catch (SQLException exception) {
            showError(exception);
        } finally {
            statement.close();
            resultSet.close();
        }

        return words;
    }

    @Override
    public String delete(String database, int Id) throws SQLException {
        String back = null;
        try {
            String sql = "DELETE FROM `" + database + "` WHERE (`Id` = '" + Id + "');";
            statement = getConnection().createStatement();
            statement.execute(sql);
            back = "Deleted";
        } catch (SQLException exception) {
            showError(exception);
            back = "Could not be deleted.";
        } finally {
            statement.close();
            return back;
        }
    }

    @Override
    public void update(String database, String english, String turkish, int id) throws SQLException {
        try {
            statement = getConnection().createStatement();
            String sql = "UPDATE `" + database + "` SET `english` = '" + english + "',`turkish` = '" + turkish + "' WHERE (`Id` = '" + id + "');";
            statement.execute(sql);
        } catch (SQLException exception) {
            showError(exception);
        } finally {
            statement.close();
        }
    }

    @Override
    public void addTo(String where, String from, int id, String english, String turkish, String date) throws SQLException {
        String insertSql = "INSERT INTO `" + where + "` (`english`, `turkish`, `date_of_addition`) VALUES ('" + english + "', '" + turkish + "', '" + date + "');";
        String deleteSql = "DELETE FROM `" + from + "` WHERE (`Id` = '" + id + "');";
        try {
            statement = getConnection().createStatement();
            statement.execute(insertSql);

            delete(from, id);
        } catch (SQLException exception) {
            showError(exception);
        } finally {
            statement.close();
        }
    }

    @Override
    public ArrayList search(String likeSQL, String table) throws SQLException {
        ArrayList<Words> words = null;
        try {
            words = new ArrayList<Words>();
            statement = getConnection().createStatement();

            String sql;
            if (table == "forgotten_date") {
                sql = "SELECT w.english, w.turkish, w.forgotten, w.date_of_addition, d.forgotten_date FROM words w JOIN forgotten_date d ON d.words_id = w.Id WHERE w.english LIKE '%" + likeSQL + "%' ORDER BY english";
            } else {
                sql = "SELECT * FROM " + table + " WHERE english LIKE '%" + likeSQL + "%'";
            }

            resultSet = statement.executeQuery(sql);

            if (table == "words") {
                while (resultSet.next()) {
                    words.add(new Words(resultSet.getInt("Id"), resultSet.getString("english"), resultSet.getString("turkish"), resultSet.getInt("forgotten"), resultSet.getDate("date_of_addition").toString()));
                }
            } else if (table == "learned") {
                while (resultSet.next()) {
                    words.add(new Words(resultSet.getInt("Id"), resultSet.getString("english"), resultSet.getString("turkish"), resultSet.getDate("date_of_addition").toString()));
                }
            } else if (table == "forgotten_date") {
                while (resultSet.next()) {
                    words.add(new Words(resultSet.getString("english"), resultSet.getString("turkish"), resultSet.getInt("forgotten"), resultSet.getDate("date_of_addition").toString(), resultSet.getDate("forgotten_date").toString()));
                }
            }

        } catch (SQLException exception) {
            showError(exception);
        } finally {
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

    public ResultSet execute(String sql) throws SQLException {
        try {
            statement = getConnection().createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException exception) {
            showError(exception);
        }
        return resultSet;
    }

    public void increaseForgotten(String english) throws SQLException {
        try {
            resultSet = execute("SELECT forgotten FROM words WHERE (english='" + english + "');");
            resultSet.next();

            String sql = "UPDATE words SET forgotten=? WHERE english=?";
            preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, (resultSet.getInt(1) + 1));
            preparedStatement.setString(2, english);
            preparedStatement.execute();

        } catch (SQLException exception) {
            showError(exception);
        } finally {
            preparedStatement.close();
            resultSet.close();
        }

    }

    public void insertFD(String english) throws SQLException {
        try {
            resultSet = execute("SELECT Id FROM words WHERE (english = '" + english + "');");
            resultSet.next();

            String sql = "INSERT INTO forgotten_date (words_id,forgotten_date) VALUES(?,?)";
            preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setInt(1, resultSet.getInt(1));
            preparedStatement.setDate(2, (java.sql.Date) getDate());
            preparedStatement.execute();
        } catch (SQLException exception) {
            showError(exception);
        } finally {
            preparedStatement.close();
            resultSet.close();
        }
    }

    public void addLearned(String english) throws SQLException {
        try {
            resultSet = execute("SELECT * FROM words WHERE english='" + english + "'");
            resultSet.next();

            String sql = "INSERT INTO learned (english,turkish,date_of_addition) VALUES(?,?,?)";
            preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, resultSet.getString("english"));
            preparedStatement.setString(2, resultSet.getString("turkish"));
            preparedStatement.setDate(3, resultSet.getDate("date_of_addition"));
            preparedStatement.execute();

            sql = "DELETE FROM `words` WHERE (`english` = '" + english + "');";
            preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.execute();
        } catch (SQLException exception) {
            showError(exception);
        } finally {
            preparedStatement.close();
            resultSet.close();
        }
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
                today.add(read.nextLine());
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
