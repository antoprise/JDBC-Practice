/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import sit.controller.StudentController;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class TestStudentDB {

    public static void main(String[] args) throws IOException {
        try {
            //StudentController stdCtrl=new StudentController("sit", "sit");
            /*   Properties dbPros=new Properties();
            dbPros.setProperty("user", "sit");
            dbPros.setProperty("password", "sit");
            StudentController stdCtrl=new StudentController(dbPros);
            int rec=stdCtrl.insertStudent(new Student(99, "James", "Bonds"));
            System.out.println("inserted "+rec+" record");            
            stdCtrl.close();
            /*int recs=stdCtrl.deleteAllStudents();
            System.out.println("deleted "+recs+" records");*/
            String file = "dbProperties.txt";
            StudentController stdCtr1 = new StudentController(file);
            int recs =stdCtr1.InsertStudentFormFile("StudentList.txt");
            System.out.println(recs+"inserted records");
            /* int recs = stdCtr1.InsertStudentFormFile("StudentList.txt");
            System.out.println(recs+" inserted recoirds");*/
          /*  ArrayList<Student> list = stdCtr1.executeCommand("update student set lastname ='Bonds' where stdId=1005");
            if (list != null) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            }*/
            stdCtr1.close();

        } catch (IOException ioEx) {
            System.out.println(ioEx);
        } catch (SQLException sqlEx) {
            System.out.println(sqlEx);
        }

    }
}
