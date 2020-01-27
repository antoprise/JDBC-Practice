/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EmployeeController;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;
import model.Employee;

/**
 *
 * @author alex
 */
public class TestEmployee {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        try {
            Scanner input = new Scanner(System.in);
            EmployeeController employee = new EmployeeController("sit", "sit");

          System.out.print("If you want records information about Employee Please Insert(Y/N (for exit)): ");
            char option = input.next().charAt(0);
            option = Character.toLowerCase(option);

            if (option == 'y') {
                employee.createEmployeeTable();
            }

            System.out.println("[----- Choose Option -----]");
            System.out.println("1) : Find Employee.\n"
                    + "2)Insert data.\n"
                    + "3)Update data(Firstname)\n"
                    + "4)Update data(Lastname)\n"
                    + "5)Update data(Job)\n"
                    + "6)Update data(Salary)\n"
                    + "7)Update data(Address)\n"
                    + "8)Delete data.\n"
                    + "9)Delete All data.\n"
                    + "0)Exit.\n");
            System.out.print("Input : ");
            int number = input.nextInt();

            while (number != 0) {
                if (number == 1) {
                    Scanner findemp = new Scanner(System.in);

                    System.out.print("Input empId : ");
                    int id = findemp.nextInt();

                    Employee empId = new Employee(id);
                    employee.findEmployee(empId);

                } else if (number == 2) {
                    Scanner insertEmp = new Scanner(System.in);
                    System.out.print("Insert empId : ");
                    int id = insertEmp.nextInt();
                    System.out.print("Insert FirstName : ");
                    insertEmp.nextLine();
                    String fname = insertEmp.nextLine();
                    System.out.print("Insert Lastname : ");
                    String lname = insertEmp.nextLine();
                    System.out.print("Insert Jobs : ");
                    String jobs = insertEmp.nextLine();
                    System.out.println("Insert Salary : ");
                    double salary = insertEmp.nextDouble();
                    System.out.println("Insert Address : ");
                    insertEmp.nextLine();
                    String addr = insertEmp.nextLine();
                    
                   

                   Employee emp = new Employee(id, fname, lname, jobs, salary, addr);
                    employee.insertEmployee(emp);
                    System.out.println(emp);

               } else if (number == 3) {
                    Scanner UpdatefName = new Scanner(System.in);

                    System.out.print("Insert empId : ");
                    int id = UpdatefName.nextInt();
                    System.out.print("Update Firstname : ");
                    String newfName = UpdatefName.nextLine();
                    employee.updateFirstnameEmployee(id, newfName);
                } else if (number == 4) {
                    Scanner UpdatelName = new Scanner(System.in);

                    System.out.print("Insert empId : ");
                    int id = UpdatelName.nextInt();
                    System.out.print("Update Lastname : ");
                    String newlName = UpdatelName.nextLine();
                    employee.updateFirstnameEmployee(id, newlName);
                } else if (number == 5) {
                    Scanner UpdateJob = new Scanner(System.in);

                    System.out.print("Insert empId : ");
                    int id = UpdateJob.nextInt();
                    System.out.print("Update Job : ");
                    String newJob = UpdateJob.next();
                    employee.updateJobEmployee(id, newJob);
                } else if (number == 6) {
                    Scanner UpdateSalary = new Scanner(System.in);

                    System.out.print("Insert empId : ");
                    int id = UpdateSalary.nextInt();
                    System.out.print("Update Salary : ");
                    double newSalary = UpdateSalary.nextDouble();
                    employee.updateSalaryEmployee(id, newSalary);
                } else if (number == 7) {
                    Scanner UpdateAddress = new Scanner(System.in);

                    System.out.print("Insert empId : ");
                    int id = UpdateAddress.nextInt();
                    System.out.print("Update Address : ");
                    String newAddress = UpdateAddress.nextLine();
                    employee.updateAddressEmployee(id, newAddress);
                } else if (number == 8) {
                    Scanner delete = new Scanner(System.in);

                    System.out.print("Insert empId : ");
                    int id = delete.nextInt();

                    Employee pdId = new Employee(id);
                    employee.deleteEmployee(pdId);
                } else if (number == 9) {
                    employee.deleteAllEmployee();
                } else if (number == 10) {
                    employee.deleteTable();
                } else {
                    System.out.println("Invalid insert");
                }

                System.out.println("[----- Choose Option -----]");
                System.out.println("1)Find Employee.\n"
                        + "2)Insert data.\n"
                        + "3)Update data. (Firstname)\n"
                        + "4)Update data. (Lastname)\n"
                        + "5)Update data. (Job)\n"
                        + "6)Update data. (Salary)\n"
                        + "7)Update data. (Address)\n"
                        + "8)Delete data.\n"
                        + "9)Delete All data.\n"
                        + "10)Delete Table.\n"
                        + "0) : Exit.\n");
                System.out.print("Choose Option : ");
                number = input.nextInt();
            }
            employee.close();
        } catch (ClassNotFoundException cnf) {
            System.out.println(cnf);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
