import java.util.*;

public class BubbleGenerics {

    public static <T extends Comparable<T>> void bubble(T[] array) {
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1].compareTo(array[i]) > 0) {
                    
                    T temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        }while (swapped);
    }

    public static void main(String[] args) {
        Integer[] intArray = {3, 21, 56, 78, 44, 1};
        String[] strArray = {"this", "is", "completely", "random"};

        System.out.println("Original array of integers: " + Arrays.toString(intArray));
        bubble(intArray);
        System.out.println("Sorted: " + Arrays.toString(intArray));
        System.out.println("");

        System.out.println("Original string: " + Arrays.toString(strArray));
        bubble(strArray);
        System.out.println("Sorted strings: " + Arrays.toString(strArray));
    }
}