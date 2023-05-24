package seminar2;

import java.util.Random;

public class SortBinary {
    public static void main(String[] args) {
        Random random = new Random();
        int length = 100;
        int endPosition = 10;
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            //array[i] = random.nextInt(endPosition);
            array[i] = i;
        }
        long start1 = System.nanoTime();
        System.out.println(binarySort(array, 5, 0, array.length-1));
        long end1 = System.nanoTime();
        System.out.println(end1 - start1);

        long start2 = System.nanoTime();
        System.out.println(find(array, 5));
        long end2 = System.nanoTime();
        System.out.println(end2 - start2);
    }


    public static int binarySort(int[] array, int value, int min, int max) {
        int midpoint;
        if (max < min)
            return -1;
        else
            midpoint = (max - min) / 2 + min;
        if (array[midpoint] < value)
            return binarySort(array, value, midpoint + 1, max);
        else {
            if (array[midpoint] > value)
                return binarySort(array, value, min, midpoint - 1);
            else
                return midpoint;
        }
    }


    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }


}
