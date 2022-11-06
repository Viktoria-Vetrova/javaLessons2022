package task02;

import java.util.ArrayList;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        int[] array = {1, 10, 20, -10, 18};
        int[][][] array3 = {{{1, 2}, {5, 10}}, {{-1, 80}, {3, 4}, {7, -5}}};
        System.out.printf("max value: %d \n", maxValue(array));
        System.out.printf("min value: %d \n", minValue(array));
        System.out.printf("sum: %d \n", sumValue(array));


        System.out.printf("max value from array3: %d \n", maxValue(getArray(array3)));
        System.out.printf("min value from array3: %d \n", minValue(getArray(array3)));
        System.out.printf("sum from array3: %d \n", sumValue(getArray(array3)));

        // Fibonnachi
        System.out.printf("Fibonachi: %d \n", getFibonnachi(6));

        //polindrom
        System.out.println(isPalindrome("а")); // true
        System.out.println(isPalindrome("амма")); // true
        System.out.println(isPalindrome("шалаш")); // true
        System.out.println(isPalindrome("арка")); //false
        System.out.println(isPalindrome("")); // false

        //miniGame
        System.out.println(miniGame());
    }

    public static int maxValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    public static int sumValue(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static int[] getArray(int[][][] array3) {
        int[] array;
        int index = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                for (int k = 0; k < array3[i][j].length; k++) {
                    arrayList.add(array3[i][j][k]);
                }
            }
        }
        array = new int[arrayList.size()];
        for (int k : arrayList) {
            array[index] = k;
            index++;
        }

        return array;
    }

    public static int getFibonnachi(int f) {
        if (f == 0) {
            return 0;
        } else if (f == 1) {
            return 1;
        } else {
            return getFibonnachi(f - 1) + getFibonnachi(f - 2);
        }
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        } else if (s.length() <= 0) {
            return false;
        }
        char[] chars = s.toCharArray();

        for (int head = 0, tile = s.length() - 1; head < tile; head++, tile--) {
            if (chars[head] != chars[tile]) {
                return false;
            }
        }

        return true;
    }

    public static String miniGame() {
        int randomNumber = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number from 0 to 100 ");
        String userInput = scanner.next();
        int userRandom = Integer.valueOf(userInput).intValue();

        while (userRandom != randomNumber) {
            if (userRandom < randomNumber) {
                System.out.println("your number less random number\n");
                System.out.printf("Input number from %d to 100\n", userRandom);
            } else {
                System.out.println("your number more random number\n");
                System.out.printf("Input number from 0 to %d\n", userRandom);
            }

            userInput = scanner.next();
            userRandom = Integer.valueOf(userInput).intValue();
        }

        return "Congratulations";
    }
}

