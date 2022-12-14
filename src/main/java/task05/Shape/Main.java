package task05.Shape;

public class Main {
    public static void main(String args[]) {
        Circle circle1 = new Circle(1.25);
        printArea(circle1);
        Rectangle rectangle1 = new Rectangle(10, 1.25);
        printArea(rectangle1);
        Square square1 = new Square(6.05);
        printArea(square1);
    }

    public static void printArea(Shape shape) {
        System.out.printf("Area %s = %f \n", shape.getClass().getSimpleName(), shape.area());
    }
}
