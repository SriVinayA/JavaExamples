import java.util.*;

public class AddingElementsInAnArray {
    public static void main(String[] args) {

    int[] arr = {12, 13, 14};
    List arr1 = Arrays.asList(arr);
    System.out.println(arr1);
    arr1.add(15);
    arr1.add(16);
    System.out.println(arr1);
    }   
}