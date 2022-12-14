package task05.Instruments;

public class Trumpet implements Instruments {
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Plays " + this.getClass().getSimpleName() + "," + this.getClass().getSimpleName() + " has " + this.diameter + " diameter");
    }
}
