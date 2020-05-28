package Wipro;

public class CountEvenOdd {
    public static void main(String[] args) {
        int input1 = 0;
        int input2 = 17;
        int input3 = 19;
        int input4 = 14;
        int input5 = 115;
        String input6 = "odd";

        int[] input = { input1, input2, input3, input4, input5 };
        int count = 0;
        int len = input.length;
        for (int value : input) {
            if (value % 2 == 0) {
                count++;
            }
        }
        if (input6.equals("even")) {
            System.out.println(count);
        } else {
            System.out.println(len - count);
        }
    }
}