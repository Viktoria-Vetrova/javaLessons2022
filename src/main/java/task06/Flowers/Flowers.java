package task06.Flowers;

public class Flowers {
    private String country;
    private int price;
    public static int counter;

    protected Flowers(String country, int price) {
        this.country = country;
        this.price = price;
        counter += 1;
    }

    public int getPrice() {
        return this.price;
    }

    public String getCountry() {
        return this.country;
    }
}
