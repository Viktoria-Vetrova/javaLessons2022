package task05.Instruments;

public class Drum implements Instruments {
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Plays " + this.getClass().getSimpleName() + "," + this.getClass().getSimpleName() + " has size " + this.size);
    }
}
