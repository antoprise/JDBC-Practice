/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;



import sit.model.Student;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author INT105
 */
public class TestScanner {

    public static void main(String[] args)  {
     int numoflines = 0;
     int numofwords = 0;
     int numofchar =0;
     ArrayList<Student> stdList=new ArrayList<Student>();
     
        try{
         File myFile=new File("Student.txt");
         Scanner input = new Scanner(myFile);
         while(input.hasNextLine()){
             numoflines+=1;
             String line =input.nextLine();
             numofchar+= line.length();
             System.out.println(line);
             System.out.println("---");
             
             Scanner str = new Scanner(line);
             while(str.hasNext()){
                  int id = str.nextInt();
                  String firstname=str.next();
                  String lastname = str.next();
                 Student std = new Student(id,firstname,lastname);
                 stdList.add(std);
                 numofwords+=1;
                  
               //  System.out.println(str.next());
             }
             System.out.println("---");
         }
     }
     catch(FileNotFoundException ff){
         System.out.println(ff);
     }
        System.out.println("Number of lines: "+numoflines);
        System.out.println("Number of words: "+numofwords);
        System.out.println("Number of chars: "+ numofchar);
        
        
        
        /*  String myMessage = "Mango Grape Apple Guava";
        Scanner sc = new Scanner(myMessage);
        int words = 0;
        while (sc.hasNext()) {
            System.out.println(sc.next());
            words += 1;
        }
        System.out.println("Number of words:"+words);*/
    }

}
