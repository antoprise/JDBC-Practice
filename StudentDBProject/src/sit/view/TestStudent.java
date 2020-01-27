package sit.view;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import sit.controller.StudentController;
import sit.model.Student;

public class TestStudent {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        StudentController c1 = new StudentController("sit", "sit");
        ViewStudent s1 = new ViewStudent();
        System.out.println("list of all students");
        ArrayList<Student> list = c1.selectStudent();
        for (Student std : list) {
            System.out.println(std);
        }
    }
}
