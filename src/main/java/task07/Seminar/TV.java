package task07.Seminar;

import java.util.Objects;

public class TV extends Product {
    private final String brand;
    private final int screenSize;

    public TV(double regularPrice, String brand, int screenSize) {
        super(regularPrice);
        this.brand = brand;
        this.screenSize = screenSize;
    }

    @Override
    public double getSalePrice() {
        double result = getRegularPrice() * 1.3;
        return result;
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + this.brand + '\'' +
                ", screenSize=" + this.screenSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return screenSize == tv.screenSize && Objects.equals(brand, tv.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, screenSize);
    }
}
