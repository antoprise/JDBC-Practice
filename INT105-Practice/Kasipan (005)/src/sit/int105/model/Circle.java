
package sit.int105.model;


public abstract class Circle extends Shape{
    private double radius;

    

    public Circle(double radius, int shapeId) {
        super(shapeId);
        this.radius = radius;
    }

    
    
    
    public double getRadius() {
        return radius;
    }
    
     @Override
    public double findArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius +"shapeId ="+super.toString()+'}';
    }
    
    
}
