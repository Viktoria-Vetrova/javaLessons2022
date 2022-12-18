package task06.Flowers;

public class Main {
    public static void main(String[] args) {
        final Rose hollandRose = new Rose("Holland", 250);
        final Rose japanRose = new Rose("Japan", 170);
        final Tulip hollandtulip = new Tulip("Holland", 170);
        final Chamomile chamomile1 = new Chamomile("Russia", 150);
        final Chamomile chamomile2 = new Chamomile("Russia", 150);
        final Chamomile chamomile3 = new Chamomile("Russia", 150);

        final Flowers[] bouguet1 = new Flowers[]{hollandRose, japanRose};
        final Flowers[] bouquet2 = new Flowers[]{hollandtulip};
        final Flowers[] bouquet3 = new Flowers[]{chamomile1, chamomile2, chamomile3};

        System.out.printf("Цена за букет 1: %d\n", BouquetUtils.priceOfBouquet(bouguet1));

        System.out.printf("Цена за букет 2: %d\n", BouquetUtils.priceOfBouquet(bouquet2));

        System.out.printf("Цена за букет 3: %d\n", BouquetUtils.priceOfBouquet(bouquet3));

        System.out.printf("Всего продали цветов: %d", Flowers.counter);
    }

}
