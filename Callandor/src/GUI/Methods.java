package GUI;

import Connection.IDataBase;
import Connection.MySQL;
import Connection.SQLite;
import Languages.*;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JPanel;

public class Methods {
    public void setValue(String variable, String value){
        try{
            FileInputStream input = new FileInputStream("src/GUI/values.properties");
            Properties properties=new Properties();
            properties.load(input);
            input.close();

            FileOutputStream output=new FileOutputStream("src/GUI/values.properties");
            properties.setProperty(variable,value);
            properties.store(output,null);
            output.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public String getValue(String variable){
        String back="";
        try{
            FileInputStream input = new FileInputStream("src/GUI/values.properties");
            Properties properties=new Properties();
            properties.load(input);
            input.close();

            FileOutputStream output=new FileOutputStream("src/GUI/values.properties");
            back=properties.getProperty(variable);
            properties.store(output,null);
            output.close();

            return back;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return back;
    }
    
    public IDataBase getDataBase(String database) throws IOException, SQLException {
        if (database.equals("MySQL")==true) {
            return new MySQL();
        } else {
            if(new File("components/english.db").exists()==false) 
                new SQLite().CreateTables();
            return new SQLite();
        }
    }
    
    public ILanguages getLanguage(String language){
        if(language.equals("French")==true){
            return new french();
        }
        else if(language.equals("German")==true){
            return new german();
        }
        else if(language.equals("Italian")==true){
            return new italian();
        }        
        else{
            return new turkish();
        }
    }
    
    void setColor(JPanel panel, int x, int y, int z) {
        panel.setBackground(new Color(x, y, z));
    }
    
    void resetColor(JPanel panel, int x, int y, int z) {
        panel.setBackground(new Color(x, y, z));
    }
    
    
    

}
