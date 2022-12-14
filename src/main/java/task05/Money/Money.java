package task05.Money;

public class Money {
    private int ruble;
    private int penny;

    public Money(int ruble, int penny) {
        this.ruble = ruble;
        this.penny = penny;
    }

    public Money plus(Money other) {
        int sum = (this.ruble * 100) + this.penny;
        sum = sum + (other.ruble * 100) + other.penny;
        int ruble = sum / 100;
        int penny = sum % 100;

        Money money = new Money(ruble, penny);

        return money;
    }

    public Money minus(Money other) {
        int sum = (this.ruble * 100) + this.penny;
        sum = sum - (other.ruble * 100) - other.penny;
        int ruble = sum / 100;
        int penny = sum % 100;

        Money money = new Money(ruble, penny);

        return money;
    }

    public Money multiply(int multiplier) {
        int multiple = (this.ruble * 100) + this.penny;
        multiple = multiple * multiplier;
        int ruble = multiple / 100;
        int penny = multiple % 100;

        Money money = new Money(ruble, penny);

        return money;
    }

    public void print() {
        System.out.printf("Ruble = %d Penny = %d \n", this.ruble, this.penny);
    }
}
