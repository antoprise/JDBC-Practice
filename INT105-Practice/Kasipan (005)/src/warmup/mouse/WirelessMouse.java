/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup.mouse;

/**
 *
 * @author INT105
 */
public class WirelessMouse extends Mouse{
     private double frequency;
    
    public WirelessMouse(String color,double frequency){
        super(color);
        this.frequency = frequency;
    }
    
    
       public String toString() {
        return color + "mouse = "+"Wireless mouse With "+frequency+"Ghz. With wireless technology";
    } 
   }

