package task07.Seminar;

public class ChildrenBook extends Book {

    public ChildrenBook(double regularPrice, String author, String name, int publishedYear) {
        super(regularPrice, author, name, publishedYear);
    }

    @Override
    public double getSalePrice() {
        double result = getRegularPrice() * 0.6;
        return result;
    }
}
