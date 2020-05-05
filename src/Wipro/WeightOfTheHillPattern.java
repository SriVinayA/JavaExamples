package Wipro;

public class WeightOfTheHillPattern {
    public static void main(String[] args) {
        int input1 = 5;
        int input2 = 10;
        int input3 = 2;
        int count = 0;
        for (int i = 0; i < input1; i++) {
            for (int j = 0; j <= i; j++) {
                count = input2 + count;
            }
            input2 = input2 + input3;
        }
        System.out.println(count);
    }
}