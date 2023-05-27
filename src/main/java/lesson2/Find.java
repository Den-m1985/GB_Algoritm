package lesson2;

public class Find {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 6, 9, 5, 2, 4, 5, 2, 5};
        System.out.println(find(array, 6));
    }

    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length - 1; i++) {
           if (array[i] == value)
               return i;
        }
        return -1;
    }
}
