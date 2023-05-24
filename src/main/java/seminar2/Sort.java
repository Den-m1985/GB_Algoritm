package seminar2;

import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        Random random = new Random();
        int length = 10000;
        int endPosition = 101;
        int[] array1 = new int[length];
        int[] array2 = new int[length];
        int[] array3 = new int[length];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(endPosition);
            array2[i] = random.nextInt(endPosition);
            array3[i] = random.nextInt(endPosition);
        }

        long start1 = System.nanoTime();
        bubbleSort(array1);
        long end1 = System.nanoTime();
        System.out.println(end1 - start1);

        long start2 = System.nanoTime();
        directSort(array2);
        long end2 = System.nanoTime();
        System.out.println(end2 - start2);

        long start3 = System.nanoTime();
        quickSort(array3, 0, array3.length - 1);
        long end3 = System.nanoTime();
        System.out.println(end3 - start3);
    }


    public static void bubbleSort(int[] array) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        } while (!finish);
    }


    public static void directSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    public static void quickSort(int[] array, int startPosition, int endPosition) {
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        //int pivot = array[(startPosition + endPosition) / 2];
        int pivot = array[startPosition + (endPosition - startPosition) / 2];
        do {
            while (array[leftPosition] < pivot) {
                leftPosition++;
            }
            while (array[rightPosition] > pivot) {
                rightPosition--;
            }
            if (leftPosition <= rightPosition) {
                if (leftPosition < rightPosition) {
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }
        } while (leftPosition <= rightPosition);
        if (leftPosition < endPosition)
            quickSort(array, leftPosition, endPosition);
        if (startPosition < rightPosition)
            quickSort(array, startPosition, rightPosition);
    }


}
