package task07.HW;

public class Driver extends Person {
    private final int experience;

    public Driver(Person person, int experience) {
        super(person.getLastName(), person.getFirstName(), person.getMiddleName(), person.getAge());
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "person=" + super.toString() +
                " experience=" + experience +
                '}';
    }

    @Override
    public Driver clone() throws CloneNotSupportedException {
        Person personClone = (Person) super.clone();
        return new Driver(personClone, this.experience);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Driver driver = (Driver) o;

        return experience == driver.experience;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + experience;
        return result;
    }
}
