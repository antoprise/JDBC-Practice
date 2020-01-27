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
public class UnderGraduatedStudent extends Student2{

    private String project;

    public UnderGraduatedStudent() {
        System.out.println("UnderGraduated Constructor Working");
    }
    
    

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "UnderGraduatedStudent{" + "project=" + project + '}';
    }

}
