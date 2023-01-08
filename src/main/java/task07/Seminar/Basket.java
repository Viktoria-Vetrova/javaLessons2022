package task07.Seminar;

import task07.Seminar.filter.ProductFilter;

public class Basket {
    private final int countProduct;
    private int counter = 0;
    private Product[] products;

    public Basket(int countProduct) {
        this.countProduct = countProduct;
        this.products = new Product[countProduct];
    }

    public boolean addProduct(Product product) {
        if (this.counter < this.countProduct) {
            for (Product good : products) {
                if (good != null && good.equals(product)) {
                    return false;
                }
            }

            this.products[counter] = product;
            this.counter += 1;
            return true;
        }

        return false;
    }

    public double totalSalePrice() {
        double result = 0;
        if (this.products.length == 0) {
            return result;
        } else {
            for (Product product : products) {
                if (product != null) {
                    result += product.getSalePrice();
                }
            }
        }

        return result;
    }

    public int getCurrentSize() {
        return this.counter;
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
