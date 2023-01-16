package task07.Seminar.filter;

import task07.Seminar.Product;

public class BookFilter implements ProductFilter {

    @Override
    public Product[] filter(Product[] products) {
        Product[] books = new Product[products.length];
        int count = 0;

        for (Product product : products) {
            if (product instanceof task07.Seminar.Book) {
                books[count] = product;
                count += 1;
            }
        }

        Product[] copyBooks = new Product[count];
        for (Product product : books) {
            if (product != null) {
                copyBooks[count - 1] = product;
                count--;

            }
        }

        return copyBooks;
    }
}
