/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author INT105
 */
public class ConnectionManager2 {

    public static Connection createConnection(String url, String username, String psw) throws SQLException, ClassNotFoundException {
        // option for register driver name to DriverManager
        //Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        Connection cn = DriverManager.getConnection(url, username, psw);
        return cn;
    }

    public static Connection createConnection(String url, Properties props) throws SQLException {
        Connection cn=DriverManager.getConnection(url, props);
        return cn;
    }
    public static void closeConnection(Connection cn) throws SQLException{
        cn.close();
        
    }
}
