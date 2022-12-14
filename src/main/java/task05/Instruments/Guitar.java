package task05.Instruments;

public class Guitar implements Instruments {
    private int countChord;

    public Guitar(int count) {
        this.countChord = count;
    }

    @Override
    public void play() {
        System.out.println("Plays " + this.getClass().getSimpleName() + "," + this.getClass().getSimpleName() + " has " + this.countChord + " chords");
    }
}
