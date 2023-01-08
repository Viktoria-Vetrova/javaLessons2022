package task06.Fruit;

public class Main {

    public static void main(String[] args) {
        final Apple apple1 = new Apple(0.33);
        final Apple apple2 = new Apple(1.25);
        final Orange orange = new Orange(2.25);

        System.out.println(Apple.totalApplePrice);
        System.out.println(Orange.totalOrangePrice);
        System.out.println(Fruit.totalPrice);
    }

}
