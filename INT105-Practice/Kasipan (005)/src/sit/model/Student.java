/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.model;

/**
 *
 * @author INT105
 */
public class Student {
    private int stdId;
    private String stdFirstname;
    private String stdLastname;

    public Student(int stdId, String stdFirstname, String stdLastname) {
        this.stdId = stdId;
        this.stdFirstname = stdFirstname;
        this.stdLastname = stdLastname;
    }

    public Student() {
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdFirstname() {
        return stdFirstname;
    }

    public void setStdFirstname(String stdFirstname) {
        this.stdFirstname = stdFirstname;
    }

    public String getStdLastname() {
        return stdLastname;
    }

    public void setStdLastname(String stdLastname) {
        this.stdLastname = stdLastname;
    }

    @Override
    public String toString() {
        return "Student{" + "stdId=" + stdId + ", stdFirstname=" + stdFirstname + ", stdLastname=" + stdLastname + '}';
    }
}

   