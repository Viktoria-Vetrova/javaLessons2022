package task07.HW.Car;

import task07.HW.Driver;
import task07.HW.Engine;

public class Lorry extends Car implements Cloneable {
    private final int carrying;

    public Lorry(String modelCar, double weight, Driver driver, Engine engine, int carrying) {
        super(modelCar, weight, driver, engine);
        this.carrying = carrying;
    }

    @Override
    public Lorry clone() throws CloneNotSupportedException {
        Car carClone = super.clone();
        return new Lorry(carClone.getModelCar(), carClone.getWeight(), carClone.getDriver(), carClone.getEngine(), this.carrying);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Lorry lorry = (Lorry) o;

        return carrying == lorry.carrying;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + carrying;
        return result;
    }
}
