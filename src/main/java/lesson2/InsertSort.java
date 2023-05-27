package lesson2;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 6, 9, 5, 2, 4, 5, 2, 5};
        insertSort(array);
        for (int z : array) {
            System.out.print(z + " ");
        }
    }

    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
