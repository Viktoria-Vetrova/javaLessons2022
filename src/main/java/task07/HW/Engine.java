package task07.HW;

public class Engine implements Cloneable {
    private final int power;
    private final String brand;

    public Engine(int power, String brand) {
        this.power = power;
        this.brand = brand;
    }

    public void start() {
        System.out.println("Engine is starting");
    }

    public void stop() {
        System.out.println("Engine is stopping");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (power != engine.power) return false;
        return brand.equals(engine.brand);
    }

    @Override
    public int hashCode() {
        int result = power;
        result = 31 * result + brand.hashCode();
        return result;
    }
}
