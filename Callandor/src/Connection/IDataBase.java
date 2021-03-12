package Connection;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IDataBase {
    String addWord(String english, String turkish) throws SQLException;

    void showError(SQLException exception);

    ArrayList getWords(String table) throws SQLException;
    
    public String delete(String database, int Id) throws SQLException;
    
    public void update(String database, String english, String turkish,int id) throws SQLException;
    
    public void addTo(String where, String from,int id, String english, String turkish, String date) throws SQLException;
    
    public ArrayList search(String likeSQL, String table) throws SQLException;
    
    public ArrayList<String> getDaily() throws SQLException, IOException;

//public ArrayList<Words> getDaily() throws FileNotFoundException, SQLException, IOException;

}
