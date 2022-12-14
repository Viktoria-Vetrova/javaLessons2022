package task05.Money;

public class Main {
    public static void main(String[] args) {
        Money money1 = new Money(1, 10);
        Money money2 = new Money(0, 70);
        Money money3 = money1.plus(money2);
        money3.print();

        Money money4 = money3.minus(money1);
        money4.print();

        Money money5 = money4.multiply(5);
        money5.print();

        money1.print();
        money2.print();
        money3.print();
        money4.print();
        money5.print();
    }
}
