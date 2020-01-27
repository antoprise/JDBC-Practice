/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.db;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {

    public static Connection createConnection(String fileName) throws FileNotFoundException, IOException, SQLException {
        Properties prop = new Properties();
        prop.load(new FileReader(fileName));
        String serverName = prop.getProperty("SERVER_NAME");
        String serverPort = prop.getProperty("SERVER_PORT");
        String dbName = prop.getProperty("DB_NAME");
        String user = prop.getProperty("DB_USER");
        String password = prop.getProperty("DB_PASSWORD");
        org.apache.derby.jdbc.ClientDataSource ds = new org.apache.derby.jdbc.ClientDataSource();
        ds.setServerName(serverName);
        ds.setPortNumber(Integer.parseInt(serverPort));
        ds.setDatabaseName(dbName);
        ds.setUser(user);
        ds.setPassword(password);
        Connection cn = ds.getConnection();
        return cn;
    }

    public static Connection createConnection(String url, String username, String psw)
            throws ClassNotFoundException, SQLException {
        //option for register driver name to DriverManager
        // Class.forName("org.apache.derby.jdbc.EmbeddedDriver");                       
        Connection cn = DriverManager.getConnection(url, username, psw);

        return cn;

    }

    public static Connection createConnection(String url, Properties props)
            throws SQLException {
        Connection cn = DriverManager.getConnection(url, props);
        return cn;
    }

    public static void closeConnection(Connection cn)
            throws SQLException {
        cn.close();
    }

}
