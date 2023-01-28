package task07.HW;

import task07.HW.Car.Lorry;
import task07.HW.Car.SportCar;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Иванов", "Иван", "Иванович", 42);
        Driver driver = new Driver(person, 10);

        Engine engine = new Engine(210, "Toyota");

        Lorry lorry = new Lorry("MAN", 2022, driver, engine, 3000);
        SportCar sportCar = new SportCar("Ford", 1201, driver, engine, 300);
        sportCar.start();
        sportCar.turnLeft();
        sportCar.stop();

        System.out.println(lorry);
        System.out.println(sportCar);

        Lorry lorryClone = lorry.clone();
        System.out.println(lorryClone);

        System.out.println(lorryClone.equals(lorry));
        System.out.println(lorryClone.getDriver().equals(lorry.getDriver()));
        System.out.println(lorryClone.hashCode() == lorry.hashCode());


    }
}
