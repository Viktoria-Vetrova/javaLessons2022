package task06.Flowers;

public class BouquetUtils {

    private BouquetUtils() {
    }

    public static int priceOfBouquet(Flowers[] flowers) {
        int totalSum = 0;
        for (Flowers flower: flowers) {
            totalSum += flower.getPrice();
        }

        return totalSum;
    }
}
