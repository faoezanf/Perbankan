package Model;

import Controller.MainControllerUtama;
import java.sql.*;
import View.*;

public class Database {
    private String server = "jdbc:mysql://localhost:3306/bank";
    private String dbuser= "root";
    private String dbpasswd = "";
    public Statement statement = null;
    private Connection connection = null;
    private ResultSet rs = null;
    private halamanLogin view1;
    
    public Database() { 
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        connect();
    }
    public void connect() {  
        try {
            connection = DriverManager.getConnection(server, dbuser, dbpasswd);
            statement = connection.createStatement();
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat koneksi");
        }
    }
    
    public ResultSet getData(String str) { 
        try{
            rs = statement.executeQuery(str);
        }catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
        return rs;
    }
    
    public void query(String str) { 
        try{
            statement.executeUpdate(str);
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public int querySuccess(String str) { 
        int count = 0;
        try{
            rs = statement.executeQuery(str);
            if(rs.next()) {
                count = 1;
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return count;
    }
    
    public int querySuccess2(String str) { 
        int count = 0;
        try{
            count = statement.executeUpdate(str);
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return count;
    }
}
