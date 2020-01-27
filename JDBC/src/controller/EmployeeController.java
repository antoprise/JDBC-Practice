/*
 * To change this license header, choose License Headeresult in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Employee;

/**
 *
 * @author alex
 */
public class EmployeeController {

    private Connection connection;

    public EmployeeController(String user, String password) throws ClassNotFoundException, SQLException {
        String url = "jdbc:derby://localhost:1527/Employee";
        connection = ConnectionManager.createConnection(url, user, password);
        System.out.println("Connection Successfully");

    }

    /* public ArrayList<Employee> executeSQLCommand(String sql)
            throws SQLException {
        ArrayList<Employee> list = null;
        Statement stmt = connection.createStatement();
        boolean isSelectCmd = stmt.execute(sql);
        if (isSelectCmd) {
            ResultSet result = stmt.getResultSet();
            list = new ArrayList<Employee>();
            while (result.next()) {
                int id = result.getInt("Id");
                String firstname = result.getString("firesulttname");
                String lastname = result.getString("lastname");
                String job = result.getString("jobs");
                double salary = result.getDouble("salary");
                String addr = result.getString("Address");
                Employee emp = new Employee();
                emp.setId(id);
                emp.setFirstname(firstname);
                emp.setLastname(lastname);
                list.add(emp);
            }
        } else {
            int updatedRecs = stmt.getUpdateCount();
            System.out.println(updatedRecs + " updated Records");
        }
        return list;

    }*/
    public void createEmployeeTable() throws SQLException {
        /*   String sql = "create table Employee "
                + "(empId int,"
                + "firstname varchar(50),"
                + "lastname varchar(50),"
                + "jobs varchar(100),"
                + "salary double,"
                + "address varchar(500)"
                + "primary key(empId))";

        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("create table Employee successfully");*/
        String sql = "create table employee"
                + "(empId int,"
                + "firstname varchar(50),"
                + "lastname varchar(50),"
                + "jobs varchar (80),"
                + "salary double,"
                + "address varchar(250),"
                + "primary key(empId))";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Create table Employee Success !");
        System.out.println("");

    }

    public void insertEmployee(Employee emp)
            throws SQLException {
        int id = emp.getId();
        String firstName = emp.getFirstname();
        String lastName = emp.getLastname();
        String job = emp.getJobs();
        double salary = emp.getSalary();
        String addr = emp.getaddress();
        String sql = "insert into employee("
                + "empId, firstname, lastname, jobs, salary, address) values ("
                + id + ", '" 
                + firstName + "', '" 
                + lastName + "', '" 
                + job + "', '" 
                + salary +""
                + addr + ")";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Insert Employee Success");

    }

    public void findEmployee(Employee empId) throws SQLException {
        String sql = "select * from Employee " + "where empId = '" + empId.getId() + "'";
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        while (result != null && result.next()) {
            System.out.print(result.getInt("empId") + "\t");
            System.out.print(result.getString("firesulttname") + "\t");
            System.out.print(result.getString("lastname") + "\t");
            System.out.println(result.getString("jobs") + "\t");
            System.out.println(result.getDouble("salary") + "\t");

        }
        System.out.println("Find Success!");
        System.out.println("");
    }

    /*   public ArrayList<Employee> selectEmployee() throws SQLException {
        ArrayList<Employee> empList = new ArrayList<Employee>();

        Statement stmt = connection.createStatement();
        String sql = "select * from Employee";
        ResultSet result = stmt.executeQuery(sql);

        while (result.next()) {
            //orm - object relational mapping
            int empId = result.getInt("Id");
            String fName = result.getString("firesulttname");
            String lName = result.getString("lastname");
            String job = result.getString("jobs");
            double salary = result.getDouble("salary");
            String addr = result.getString("Address");
            Employee empTmp = new Employee(empId, fName, lName, job, salary, addr);
            // System.out.println(cTmp);            
            empList.add(empTmp);
        }
        return empList;

    }*/
    public void updateFirstnameEmployee(int id, String firstname) throws SQLException {
        String sql = "update salary " + "set salary='" + firstname + "'" + " where firstname='" + firstname + "'";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Updated Firstname Success");
    }

    public void updateLastnameEmployee(int id, String lastname) throws SQLException {
        String sql = "update salary " + "set salary='" + lastname + "'" + " where lastname='" + lastname + "'";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Updated Lastname Success");
    }

    public void updateJobEmployee(int id, String job) throws SQLException {
        String sql = "update salary " + "set salary='" + job + "'" + " where jobs='" + job + "'";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Updated Job Success");
    }

    public void updateSalaryEmployee(int id, double salary) throws SQLException {
        String sql = "update salary " + "set salary='" + salary + "'" + " where salary='" + id + "'";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Updated  Salary Success");
    }

    public void updateAddressEmployee(int id, String addr) throws SQLException {
        String sql = "update salary " + "set salary='" + addr + "'" + " where address='" + addr + "'";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Updated Address Success");
    }

    public void deleteEmployee(Employee empId) throws SQLException {
        String sql = "delete from Employee " + "where empId = " + "'" + empId.getId() + "'";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Delete Employee Success.");

    }

    public int deleteAllEmployee() throws SQLException {
        int deletedRecs = 0;
        String sql = "delete All Employee";
        Statement stmt = connection.createStatement();
        deletedRecs = stmt.executeUpdate(sql);
        return deletedRecs;
    }
    
    public void deleteTable() throws SQLException {
        String sql = "drop table employee";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Delete table Success");
    }

    public void close() throws SQLException {
        ConnectionManager.closeConnection(connection);
    }
}
