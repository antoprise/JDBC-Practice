/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author alex
 */
public class ConnectionManager {

   
    public static Connection createConnection(String url, String username, String psw)
            throws ClassNotFoundException, SQLException {
        //option for register driver name to DriverManager
        // Class.forName("org.apache.derby.jdbc.EmbeddedDriver");                       
        Connection cn = DriverManager.getConnection(url, username, psw);
        System.out.println("Driver class registered successfully");
        return cn;

    }

     public static void closeConnection(Connection cn)
            throws SQLException{
        cn.close();
    }    

}
