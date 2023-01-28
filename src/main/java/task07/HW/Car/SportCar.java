package task07.HW.Car;

import task07.HW.Driver;
import task07.HW.Engine;

public class SportCar extends Car {
    private final int maxSpeed;

    public SportCar(String modelCar, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(modelCar, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public SportCar clone() throws CloneNotSupportedException {
        Car carClone = super.clone();
        return new SportCar(carClone.getModelCar(), carClone.getWeight(), carClone.getDriver(), carClone.getEngine(), this.maxSpeed);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SportCar sportCar = (SportCar) o;

        return maxSpeed == sportCar.maxSpeed;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + maxSpeed;
        return result;
    }
}
