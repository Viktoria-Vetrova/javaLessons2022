package task07.Seminar;

import task07.Seminar.filter.BookFilter;
import task07.Seminar.filter.PriceFilter;

import java.util.Arrays;

public class Main {
    public static double REGULAR_PRICE = 18000;

    public static void main(String[] args) {

        TV televisor = new TV(REGULAR_PRICE, "China", 16);
        System.out.println(televisor.getSalePrice());

        Book book = new Book(REGULAR_PRICE, "King", "Green day", 1995);
        System.out.println(book.getSalePrice());

        ChildrenBook childrenBook1 = new ChildrenBook(REGULAR_PRICE, "Puskhin", "Gold fish", 1900);
        System.out.println(childrenBook1.getSalePrice());

        Basket basket = new Basket(4);
        System.out.println(basket.addProduct(book));
        basket.addProduct(televisor);
        basket.addProduct(childrenBook1);
        basket.printProducts();

        System.out.println("К оплате: " + basket.totalSalePrice());
        System.out.println("Товаров в корзине: " + basket.getCurrentSize());

        BookFilter bookFilter = new BookFilter();
        System.out.println(Arrays.toString(basket.getFiltered(bookFilter)));

        PriceFilter priceFilter = new PriceFilter(14000, 30000);
        System.out.println(Arrays.toString(basket.getFiltered(priceFilter)));

    }
}
