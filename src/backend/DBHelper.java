/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBHelper {
    private static Connection connection;

    public static void bukaKoneksi(){    
        if (connection == null) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo_akhir", "root", "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static ResultSet selectQuery(String query){
        bukaKoneksi();
        ResultSet rs = null;
        
        try {
            Statement statement = connection.createStatement();
            rs = statement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public static boolean executeQuery(String sql){
        bukaKoneksi();
        boolean result = false;
        
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
}
