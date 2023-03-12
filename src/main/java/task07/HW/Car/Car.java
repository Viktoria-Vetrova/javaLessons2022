package task07.HW.Car;

import task07.HW.Driver;
import task07.HW.Engine;

public class Car implements Cloneable {
    private final String modelCar;
    private final double weight;
    private final Driver driver;
    private final Engine engine;

    public Car(String modelCar, double weight, Driver driver, Engine engine) {
        this.modelCar = modelCar;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getModelCar() {
        return this.modelCar;
    }

    public double getWeight() {
        return this.weight;
    }

    public Driver getDriver() {
        return this.driver;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void start() {
        this.engine.start();
        System.out.println("Car is starting");
    }

    public void stop() {
        this.engine.stop();
        System.out.println("Car is stopping");
    }

    public void turnLeft() {
        System.out.println("Going to the left");
    }

    public void turnRight() {
        System.out.println("Going to the right");
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + modelCar + '\'' +
                ", weight=" + weight +
                ", driver=" + driver.toString() +
                ", engine=" + engine.toString() +
                '}';
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Driver driverClone = this.driver.clone();
        Engine engineClone = this.engine.clone();
        return new Car(this.getModelCar(), this.getWeight(), driverClone, engineClone);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.weight, weight) != 0) return false;
        if (!modelCar.equals(car.modelCar)) return false;
        if (!driver.equals(car.driver)) return false;
        return engine.equals(car.engine);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = modelCar.hashCode();
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + driver.hashCode();
        result = 31 * result + engine.hashCode();
        return result;
    }
}
