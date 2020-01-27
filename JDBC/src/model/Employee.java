 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alex
 */
public class Employee {

    private int id;
    private String firstname;
    private String lastname;
    private String jobs;
    private double salary;
    private String address;

    public Employee(int id, String firstname, String lastname, String jobs, double salary, String address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.jobs = jobs;
        this.salary = salary;
        this.address = address;
    }

    public Employee(int id) {
        this.id = id;
    }
    

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", jobs=" + jobs + ", salary=" + salary + ", address=" + address + '}';
    }
    
    
    
    

}
