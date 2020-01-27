/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int105.model;

import java.awt.Rectangle;

/**
 *
 * @author INT105
 */
public class Regtangle implements ShapeInterface,Comparable<Regtangle>{
    private double width;
    private double length;

   public int compareTo(Regtangle o){
       return (int)(findArea()-o.findArea());
   }
    
    public Regtangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double findArea(){
        return width*length;
    }
    public double findCircumference(){
        return 2*(width+length);
    }
   
    public double computeArea(){
    return width*length;
    
    }

    @Override
    public String toString() {
        return "Regtangle{" + "width=" + width + ", length=" + length + '}';
    }

   

    
    
    
}
