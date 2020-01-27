/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author INT105
 */
public class ViewStudent {

    private JFrame frameStudent;
    
    private JPanel jpnStdRec;
    private JPanel jpnButton;
   // private JPanel jpnStudentTable;
    private JPanel jpnStudentLeft;

    private JTextField txtStdId;
    private JTextField txtStdFirstname;
    private JTextField txtStdSurname;

    private JButton btnSave;
    private JButton btnSaveAsObj;
    private JButton btnReset;

    private JTable tableStd;
    private JScrollPane scrlStudent;

    public ViewStudent() {
        initGUI();
    }

    public void initGUI() {
        frameStudent = new JFrame("Student List");

        jpnStdRec = new JPanel(new GridLayout(3, 2));

        jpnStdRec.add(new JLabel("Student id"));
        txtStdId = new JTextField();
        jpnStdRec.add(txtStdId);

        jpnStdRec.add(new JLabel("Firstname"));
        txtStdFirstname = new JTextField();
        jpnStdRec.add(txtStdFirstname);

        jpnStdRec.add(new JLabel("Lastname"));
        txtStdSurname = new JTextField();
        jpnStdRec.add(txtStdSurname);
        
        jpnButton = new JPanel();
        btnSave= new JButton("Save");
        btnSaveAsObj= new JButton("SaveAs");
        btnReset = new JButton("Reset");
        jpnButton.add(btnSave);
        jpnButton.add(btnSaveAsObj);
        jpnButton.add(btnReset);
        
        jpnStudentLeft = new JPanel(new BorderLayout());
        jpnStudentLeft.add(jpnStdRec,BorderLayout.NORTH);
        jpnStudentLeft.add(jpnButton,BorderLayout.CENTER);
        
       loadStudentDataToJTable();
        tableStd=new JTable();
        
        scrlStudent=new JScrollPane();
        scrlStudent.add(tableStd);
        
        
        frameStudent.add(jpnStudentLeft,BorderLayout.WEST);
        frameStudent.add(scrlStudent,BorderLayout.CENTER);
        frameStudent.setSize(700,400);
        frameStudent.setVisible(true);
        frameStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        tableStd = new JTable();
        scrlStudent = new JScrollPane();
        scrlStudent.add(tableStd);
       
    }
    public void loadStudentDataToJTable(){
        
    }
}
