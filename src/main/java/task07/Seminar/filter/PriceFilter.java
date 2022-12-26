package task07.Seminar.filter;

import task07.Seminar.Product;

public class PriceFilter implements ProductFilter {
    private final double minPrice;
    private final double maxPrice;

    public PriceFilter(double minPrice, double maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public Product[] filter(Product[] products) {
        Product[] priceFilter = new Product[products.length];
        int count = 0;
        for (Product product : products) {
            if (product != null && (product.getSalePrice() >= this.minPrice && product.getSalePrice() <= this.maxPrice)) {
                priceFilter[count] = product;
                count++;
            }
        }

        Product[] copyPriceFilter = new Product[count];
        for (Product product : priceFilter) {
            if (product != null) {
                copyPriceFilter[count - 1] = product;
                count--;
            }
        }
        return copyPriceFilter;
    }
}
