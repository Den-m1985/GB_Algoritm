package homeWork2;

import java.util.Arrays;
import java.util.Random;

public class HeapSort {

    // Реализовать алгоритм пирамидальной сортировки (сортировка кучей).

    public static void main(String[] args) {
        Random random = new Random();
        int length = 10;
        int endPosition = 101;
        int[] array1 = new int[length];
        int[] array2 = new int[length];
        for (int i = 0; i < array1.length; i++) {
            int digit = random.nextInt(endPosition);
            array1[i] = digit;
            array2[i] = digit;
        }

        //System.out.print("Origin array: ");
        //printArray(array);          // Печатаем оригинальный массив

        long start = System.nanoTime();
        sort(array1);             // Соритруем
        //printArray(array1);      // Печатаем сортированный массив
        long end = System.nanoTime();
        System.out.println("HeapSort Time in nano sec: " + (end - start));

        long start2 = System.nanoTime();
        Arrays.sort(array2);        // Встроенная сортировка для наглядности
        //printArray(array2);
        long end2 = System.nanoTime();
        System.out.println("Sort Time in nano sec: " + (end2 - start2));
    }


    public static void sort(int[] arr) {
        int n = arr.length;

        // Строим кучу.
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Извлекаем элементы из кучи.
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущую в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }


    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1; // Левый
        int r = 2 * i + 2; // Правый
        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, largest);
        }
    }


    public static void printArray(int[] arr) {
        for (int digit : arr) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }

}
