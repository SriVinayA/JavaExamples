package Wipro;

import java.util.ArrayList;

public class EncodingThreeStrings {
    public static void main(String[] args) {
        String input1 = "abc";
        String input2 = "abcd";
        String input3 = "abcde";

        int len1 = input1.length(), len2 = input2.length(), len3 = input3.length();
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        ArrayList<String> arr3 = new ArrayList<>();

        stringDivision(input1, len1, arr1);

        stringDivision(input2, len2, arr2);

        stringDivision(input3, len3, arr3);

        // System.out.println(arr1.get(0) + arr2.get(0) + arr3.get(0));
        // System.out.println(arr1.get(1) + arr2.get(1) + arr3.get(1));
        // System.out.println((arr1.get(2) + arr2.get(2) + arr3.get(2)).toUpperCase());
    }

    private static void stringDivision(String input, int len, ArrayList<String> arr) {
        if ((len - 3) % 3 == 0) {
            int k = (len - 3) / 3;
            arr.add(input.substring(0, k + 1));
            arr.add(input.substring(k + 1, (2 * k) + 2));
            arr.add(input.substring((2 * k) + 2, (3 * k) + 3));
        } else if ((len - 4) % 3 != 0) {
            int k = (len - 4) / 3;
            arr.add(input.substring(0, k + 1));
            arr.add(input.substring(k + 1, (2 * k) + 3));
            arr.add(input.substring((2 * k) + 3, (3 * k) + 4));
        } else if ((len - 5) % 3 == 0) {
            int k = (len - 5) / 3;
            arr.add(input.substring(0, k + 2));
            arr.add(input.substring(k + 2, (2 * k) + 3));
            arr.add(input.substring((2 * k) + 3, (2 * k) + 7));
        }
    }
}
