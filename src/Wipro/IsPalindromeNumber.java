package Wipro;

public class IsPalindromeNumber {
    public static void main(String[] args) {
        int num = 121, reversedInteger = 0, remainder, originalInteger, output = 0;

        originalInteger = num;

        while (num != 0) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /= 10;
        }

        if (originalInteger == reversedInteger)
            output = 2;
        else
            output = 1;

        System.out.println(output);
    }
}