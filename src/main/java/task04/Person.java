package task04;

public class Person {
    private String name;
    private int age;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;

    }

    public void talk(String speech) {
        System.out.println("" + this.name + " says " + speech);
    }

    public void move(String destination) {
        System.out.println("" + this.name + " move to " + destination);
    }
}
