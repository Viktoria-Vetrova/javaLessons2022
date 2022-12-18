package task06.Fruit;

public abstract class Fruit {
    public static double totalPrice;
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
        this.totalPrice += totalPrice();
    }

    public double getWeight() {
        return this.weight;
    }

    public abstract double totalPrice();
}
