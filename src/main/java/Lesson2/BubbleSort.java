package Lesson2;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 6, 9, 5, 2, 4, 5, 2, 5};
        bubbleSort(array);
        for (int z:array) {
            System.out.print(z + " ");
        }
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
}
