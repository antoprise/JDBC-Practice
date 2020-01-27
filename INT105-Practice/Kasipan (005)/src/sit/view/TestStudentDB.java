/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import sit.controller.StudentController;
import java.sql.SQLException;
import java.util.Properties;
import sit.model.Student;


/**
 *
 * @author INT105
 */
public class TestStudentDB {
    public static void main(String[] args)  {
        
          //  StudentController stdCrt1=new StudentController("sit","sit");
       try{
          Properties dbPos=new Properties();
          dbPos.setProperty("user", "sit");
          dbPos.setProperty("password", "sit");
          StudentController stdCrt=new StudentController(dbPos);
          int rec=stdCrt.insertStudent(new Student(99,"James","Bonds"));
           System.out.println("insert "+rec+" records");
           stdCrt.close();
        }
      
        catch(SQLException sqlex){
            System.out.println(sqlex);
        }
    }
}
  

