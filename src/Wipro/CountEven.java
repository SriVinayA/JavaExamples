package Wipro;

public class CountEven {
    public static void main(String[] args) {
        int input1 = 12;
        int input2 = 17;
        int input3 = 19;
        int input4 = 14;
        int input5 = 115;

        int[] input = { input1, input2, input3, input4, input5 };
        int num = 0;

        for (int value : input) {
            if (value % 2 == 0) {
                num++;
            }
        }
        System.out.println(num);
    }
}