package lesson2;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 6, 9, 7, 2, 4, 50, 2, 65};
        System.out.println(binarySort(array, 5, 0, array.length-1));

    }

    public static int binarySort(int[] array, int value, int min, int max) {
        int midpoint;

        if (max < min){
            return-1;
        }else {
            midpoint = (max - min)/2 + min;
        }

        if (array[midpoint] < value){
            return binarySort(array, value, midpoint + 1, max);
        }else {
            if (array[midpoint] > value){
                return binarySort(array, value, min,midpoint + 1);
            }else {
                return midpoint;
            }
        }

    }
}
