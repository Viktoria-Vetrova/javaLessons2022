package task09;

import java.util.ArrayList;

public class ListPrinter<T> {
    private final ArrayList<T> arrayList;

    public ListPrinter() {
        arrayList = new ArrayList<>();
    }

    public void add(T element) {
        arrayList.add(element);
    }

    public void printList(boolean isOdd) {
        ArrayList<T> odd = new ArrayList<>();
        ArrayList<T> notOdd = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 2 == 0) {
                odd.add(arrayList.get(i));
            } else if (i % 2 != 0) {
                notOdd.add(arrayList.get(i));
            }
        }
        if (isOdd) {
            System.out.println(odd);
        } else {
            System.out.println(notOdd);
        }
    }
}
