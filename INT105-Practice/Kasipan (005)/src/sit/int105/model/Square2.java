/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int105.model;

/**
 *
 * @author INT105
 */
public class Square2 extends Square {

    public Square2(double side) {
        super(side);
    }

    
    
    
    public double findCircumference() {
      return getSide()*4;
    }

    @Override
    public String toString() {
        return super.toString();
    }

  

   

}
