/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.controller;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import sit.db.ConnectionManager2;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class StudentController {

    private Connection con;

    public StudentController(String username, String psw)
            throws ClassNotFoundException, SQLException {
        String url = "jdbc:derby://localhost:1527/student";
        con = ConnectionManager2.createConnection(url, username, psw);
        System.out.println("Connection created successful");
    }

    public StudentController(Properties pro) throws SQLException {
        String url = "jdbc:derby://localhost:1527/student";
        con = ConnectionManager2.createConnection(url, pro);
        System.out.println("Sonnection created Successful");
    }
    public int deleteAllStudent() throws SQLException{
        int deleteRec=0;
        String sql = "delete from student";
        Statement stmt=con.createStatement();
        deleteRec=stmt.executeUpdate(sql);
        return deleteRec;
    }
    public void close() throws SQLException{
        ConnectionManager2.closeConnection(con);
    }
    public int insertStudent(Student std) throws SQLException{
        int insertRec=0;
        int id= std.getStdId();
        String fname=std.getStdFirstname();
        String lname=std.getStdLastname();
        String sql="INSERT INTO STUDENT(stdId,firstname,lastname) VALUES("+id+"','"+fname+"','"+lname+"'}'";
        System.out.println("sql= "+sql);
        Statement stmt=con.createStatement();
        insertRec=stmt.executeUpdate(sql);
        return insertRec;
                
        
    }
}
