package task07.Seminar;

import task07.Seminar.filter.ProductFilter;

public class Basket {
    private final int countProduct;
    private int size = 0;
    private Product[] products;

    public Basket(int countProduct) {
        this.countProduct = countProduct;
        this.products = new Product[countProduct];
    }

    public boolean addProduct(Product product) {
        if (this.size < this.countProduct) {
            for (Product good : products) {
                if (good != null && good.equals(product)) {
                    return false;
                }
            }

            this.products[size] = product;
            this.size += 1;
            return true;
        }

        return false;
    }

    public double totalSalePrice() {
        double result = 0;
        for (Product product : products) {
            if (product != null) {
                result += product.getSalePrice();
            }
        }

        return result;
    }

    public int getCurrentSize() {
        return this.size;
    }

    public Product[] getFiltered(ProductFilter filter) {
        return filter.filter(this.products);
    }

    public void printProducts() {
        if (this.products.length == 0) {
            System.out.println("The basket is empty");
        } else {
            for (Product product : this.products) {
                if (product != null) {
                    System.out.println(product);
                }
            }
        }
    }
}
