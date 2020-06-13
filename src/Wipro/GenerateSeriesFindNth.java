package Wipro;

import java.util.ArrayList;

public class GenerateSeriesFindNth {
    public static void main(String[] args) {
        int input1 = 1, input2 = 3, input3 = 6, input4 = 17; // answer = 41

        int diff1 = input2 - input1;
        int diff2 = input3 - input2;

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(input1);
        arr.add(input2);
        arr.add(input3);

        int k = input3;
        int n = 3;
        while (n < input4) {
            k += diff1;
            arr.add(k);
            k += diff2;
            arr.add(k);
            n += 2;
        }
        int result = arr.get(input4 - 1);
        System.out.println(arr);
        System.out.println(result);
    }
}