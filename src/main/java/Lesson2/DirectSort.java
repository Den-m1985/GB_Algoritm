package Lesson2;

public class DirectSort {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 6, 9, 5, 2, 4, 5, 2, 5};
        directSort(array);
        for (int z:array) {
            System.out.print(z + " ");
        }
    }

    public static void directSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            if (i != min){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
}
