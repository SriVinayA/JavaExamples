package WiproPrograms;

public class IsPalindromeNumber {
    public static void main(String[] args) {
        int input1 = 121, reversedInteger = 0, remainder, originalInteger, output = 0;

        originalInteger = input1;

        while (input1 != 0) {
            remainder = input1 % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            input1 /= 10;
        }

        if (originalInteger == reversedInteger)
            output = 2;
        else
            output = 1;

        System.out.println(output);
    }
}