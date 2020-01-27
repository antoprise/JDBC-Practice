/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int105.view;

import sit.int105.model.Circle2;
import sit.int105.model.Regtangle;
import sit.int105.model.Shape;
import sit.int105.model.Square2;

/**
 *
 * @author INT105
 */
public class TestShape {
    public static void main(String[] args) {
        /* Abstract class เรียกใช้ New object ไม่ได้ แต่นำไปสร้าง Object ได้
        Shape s1 = new Shape();
        Shape s1;*/
        
        
        /*Circle2 c2 = new Circle2(2.5,1);
        double area = c2.findArea();
        double circum = c2.findCircumference();
        System.out.println("Area = "+area);
        System.out.println("circum = "+circum);*/
      
       /*  Square2 s2 = new Square2(2);
        System.out.println("Area = "+s2.findArea());
        System.out.println("circum = "+s2.findCircumference());
        System.out.println(s2);*/
      
      Regtangle r1 = new Regtangle(5,10);
      Regtangle r2 = new Regtangle(2,4);
        
        int result = r1.compareTo(r2);
        if (result >0){
            System.out.println("rec2 comes before rec1");
        }else if (result < 0){
            System.out.println("rec1 comes before rec2");
        }else if (result == 0){
            System.out.println("rec1 equals rec2");
        }
      
        
    }
    
}
