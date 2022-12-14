package task05.Shape;

public class Square implements Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return this.length * this.length;
    }
}
