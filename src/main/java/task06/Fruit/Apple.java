package task06.Fruit;

public class Apple extends Fruit {
    public static double totalApplePrice;

    public Apple(double weight) {
        super(weight);
        this.totalApplePrice += totalPrice();
    }

    @Override
    public double totalPrice() {
        return this.getWeight() * 120;
    }
}
