package sit.int105.model;

public abstract class Shape {

    protected int shapeId;

    public Shape() {
    }

    public Shape(int shapeId) {
        this.shapeId = shapeId;
    }

    public abstract double findArea();

    public abstract double findCircumference();

    @Override
    public String toString() {
        return "Shape{" + "shapeId=" + shapeId + '}';
    }

}
