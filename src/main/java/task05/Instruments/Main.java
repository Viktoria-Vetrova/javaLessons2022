package task05.Instruments;

public class Main {
    public static void main(String args[]) {
        Guitar guitar1 = new Guitar(10);
        Guitar guitar2 = new Guitar(0);
        Drum drum1 = new Drum(5);
        Trumpet trumpet1 = new Trumpet(200);

        Instruments[] instruments = new Instruments[]{guitar1, guitar2, drum1, trumpet1};

        playInstruments(instruments);
    }

    public static void playInstruments(Instruments[] instruments) {
        for (Instruments instrument : instruments) {
            instrument.play();
        }
    }
}
