package task07.Seminar;

import java.util.Objects;

public class Book extends Product {
    private final String author;
    private final String name;
    private final int publishedYear;

    public Book(double regularPrice, String author, String name, int publishedYear) {
        super(regularPrice);
        this.author = author;
        this.name = name;
        this.publishedYear = publishedYear;
    }

    @Override
    public double getSalePrice() {
        double result = getRegularPrice() * 0.8;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + this.author + '\'' +
                ", name='" + this.name + '\'' +
                ", publishedYear=" + this.publishedYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishedYear == book.publishedYear && Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, publishedYear);
    }
}
