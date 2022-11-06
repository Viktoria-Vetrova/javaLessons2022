package main;

public class Task01 {

    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1, 0.2, 0.3)); // true
        System.out.println(doubleExpression(-0.1, -0.2, -0.3)); // true
        System.out.println(doubleExpression(0.0, 0.0, 0.0)); // true
        System.out.println(doubleExpression(0.1, -0.1, 0.0)); // true
        System.out.println(doubleExpression(9.0001, -9.0, 0.00019)); // true
        System.out.println(doubleExpression(-1.000099, -1.00000100000000001, -2)); // true
        System.out.println(doubleExpression(-1.000099, -1.0000010000000001, -2)); // false
        System.out.println(doubleExpression(-0.1, -0.2, 0.3)); // false
        System.out.println(doubleExpression(0.1, 0.2, -0.3)); // false

    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 0.0001;
    }
}
