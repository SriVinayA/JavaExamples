package BasicPrograms;

import java.util.*;

public class AddingElementsInAnArray {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int x = 50;

        System.out.println("Initial Array:\n" + Arrays.toString(arr));

        List<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
        arrList.add(x);
        arr = arrList.toArray(arr);

        System.out.println("\nArray with " + x + " added:\n" + Arrays.toString(arr));
    }
}