package Wipro;

import java.util.Random;

public class AlternateAddSub {
    public static void main(String[] args) {
        int input1 = 6;
        Random random = new Random();
        int input2 = random.nextInt(2) + 1;

        int result = 0;
        if (input2 == 1) {
            while (input1 > 0) {
                result += input1 - (input1 - 1);
                input1 -= 2;
            }
        } else if (input2 == 2) {
            result = input1;
            input1--;
            while (input1 > 0) {
                result += input1 - (input1 - 1);
                input1 -= 2;
            }
        }
        System.out.println(result);
    }
}