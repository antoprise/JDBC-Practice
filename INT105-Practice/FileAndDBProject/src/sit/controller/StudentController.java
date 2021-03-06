/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;
import sit.db.ConnectionManager;
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
        con = ConnectionManager.createConnection(url, username, psw);
        System.out.println("Connection created successfully");
    }

    public StudentController(Properties pro) throws SQLException, ClassNotFoundException {
        String url = "jdbc:derby://localhost:1527/student";
        con = ConnectionManager.createConnection(url, pro);
        System.out.println("Connection created successfully");
    }

    public StudentController(String fileName) throws IOException, FileNotFoundException, SQLException {
        con = ConnectionManager.createConnection(fileName);
        System.out.println("Connection created Successfully");
    }

    public ArrayList<Student> executeCommand(String sql) throws SQLException {
        ArrayList<Student> list = null;
        Statement stmt = con.createStatement();
        boolean isSelectCmd = stmt.execute(sql);
        
        if (isSelectCmd) {
            ResultSet rs = stmt.getResultSet();
            list = new ArrayList<Student>();
            while (rs.next()) {
                int id = rs.getInt("stdId");
                String name = rs.getString("firstname");
                String lastname = rs.getString("lastname");

                Student std = new Student();
                std.setStdId(id);
                std.setStdFirstName(name);
                std.setStdLastName(lastname);
                list.add(std);
            }
            

        }else{
            int updatedRecs = stmt.getUpdateCount();
            System.out.println(updatedRecs+" updated Record");
        }
        return list;
    }

    public ArrayList<Student> selectStudent() throws SQLException {
        Statement stmt = con.createStatement();
        String sql = "select * from student";
        System.out.println(sql);
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Student> listofStudent = new ArrayList<Student>();
        while (rs.next()) {
            int id = rs.getInt("stdId");
            String name = rs.getString("firstname");
            String lastname = rs.getString("lastname");

            Student std = new Student();
            std.setStdId(id);
            std.setStdFirstName(name);
            std.setStdLastName(lastname);
            listofStudent.add(std);
        }
        return listofStudent;
    }

    public int InsertStudentFormFile(String fileName) throws FileNotFoundException, SQLException {
        Scanner sc = new Scanner(new File(fileName));
        int insertedRecs = 0;
        String sql = "insert into student("
                + "stdId, firstname, lastname) values (?,?,?)";
        PreparedStatement pStmt=con.prepareStatement(sql);
        while (sc.hasNext()) {
            int id = sc.nextInt();
            String name = sc.next();
            String lastname = sc.next();
            System.out.println(id + " " + name + " " + lastname);
           pStmt.setInt(1, id);
           pStmt.setString(2, name);
           pStmt.setString(3,lastname);
            insertedRecs +=pStmt.executeUpdate();
           // insertedRecs += insertStudent(new Student(id, name, lastname));
        }
        return insertedRecs;
    }

    public int insertStudent(Student std)
            throws SQLException {
        int insertedRec = 0;

        int id = std.getStdId();
        String fName = std.getStdFirstName();
        String lName = std.getStdLastName();

        String sql = "insert into student("
                + "stdId, firstname, lastname) values ("
                + id + ", '" + fName + "', '" + lName + "')";
        System.out.println("sql = " + sql);
        Statement stmt = con.createStatement();
        insertedRec = stmt.executeUpdate(sql);
        return insertedRec;
    }

    public int deleteAllStudents() throws SQLException {
        int deletedRecs = 0;
        String sql = "delete from student";
        Statement stmt = con.createStatement();
        deletedRecs = stmt.executeUpdate(sql);
        return deletedRecs;
    }

    public void close() throws SQLException {
        ConnectionManager.closeConnection(con);
    }
}
