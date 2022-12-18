package task06.Fruit;

public class Orange extends Fruit {
    public static double totalOrangePrice;

    public Orange(double weight) {
        super(weight);
        this.totalOrangePrice += totalPrice();
    }

    @Override
    public double totalPrice() {
        return this.getWeight() * 270;
    }
}
