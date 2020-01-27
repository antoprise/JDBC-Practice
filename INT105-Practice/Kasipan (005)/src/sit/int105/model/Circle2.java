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
public class Circle2 extends Circle {

    public Circle2(double radius, int shapeId) {
        super(radius, shapeId);
    }

  

    public String toString() {
        return super.toString();
    }

    public double findCircumference() {
        return 2 * Math.PI * getRadius();
    }

}
