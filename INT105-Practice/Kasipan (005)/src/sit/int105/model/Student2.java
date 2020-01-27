/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int105.model;

/**
 *
 * @author INT105
 */
public class Student2 {
    private long stdID;
    private String name;

    public Student2() {
        System.out.println("Student Sconstructor Working");
    }

   
    public Student2(long stdID, String name) {
        this.stdID = stdID;
        this.name = name;
    }

     public String showPortfolio(){
        return toString();
    }
     
    public long getStdID() {
        return stdID;
    }

    public void setStdID(long stdID) {
        this.stdID = stdID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   

    @Override
    public String toString() {
        return "Student2{" + "stdID=" + stdID + ", name=" + name + '}';
    }
    
    
    
}
