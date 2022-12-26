package task07.Seminar;

public abstract class Product {
    private final double regularPrice;

    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getRegularPrice() {
        return this.regularPrice;
    }

    public abstract double getSalePrice();
}
