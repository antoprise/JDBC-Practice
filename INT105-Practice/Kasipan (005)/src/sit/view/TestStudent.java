/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.sql.SQLException;
import sit.controller.studentController;

/**
 *
 * @author INT105
 */
public class TestStudent {

    public static void main(String[] args) throws SQLException {
        studentController stdCrt1 = new studentController();
        try {
            stdCrt1.connectStudentDB("org.apache.derby.jdbc.ClientDriver", "jdbc:derby://localhost:1527/student", "sit", "sit");
            stdCrt1.selectAllStudent("select * from student");
        } catch (ClassNotFoundException cf) {
            System.out.println(cf);
        } catch (SQLException sql1) {
            System.out.println(sql1);
        }
    }
}
