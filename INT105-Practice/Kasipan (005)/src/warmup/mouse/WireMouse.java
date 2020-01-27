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
public class WireMouse extends Mouse {
    private double wirelong;
    private String type;
    
    public WireMouse(String color,double wirelong,String Type) {
        super(color);
        this.wirelong = wirelong;
        this.type = Type;
        
        
        
        
        
    }

    @Override
    public String toString() {
        return color + "mouse = "+"Wire mouse With cable length "+wirelong+"m"+type+"Conector";
    }
}
