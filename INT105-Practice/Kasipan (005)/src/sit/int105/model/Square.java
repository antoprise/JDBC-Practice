package sit.int105.model;

public abstract class Square implements ShapeInterface {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double findArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }

}
