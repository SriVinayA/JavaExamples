package Wipro;

public class Remove1DigitForPalin {
    public static void main(String[] args) {
        int input1 = 251532; // answer = 3
        String str = String.valueOf(input1);
        int output = 0;

        // if digit is between numbers
        for (int i = 1; i < str.length() - 1; i++) {
            if (checkPalin(str.substring(0, i) + str.substring(i + 1))) {
                output = Character.getNumericValue(str.charAt(i));
            }
        }

        // if last digit
        if (checkPalin(str.substring(0, str.length() - 1))) {
            output = Character.getNumericValue(str.charAt(str.length() - 1));
        }

        // if first digit
        if (checkPalin(str.substring(1))) {
            output = Character.getNumericValue(str.charAt(0));
        }

        // if no digit
        if (checkPalin(str)) {
            output = -1;
        }
        System.out.println(output);
    }

    private static boolean checkPalin(String s) {
        String str = new StringBuilder(s).reverse().toString();
        return str.equals(s);
    }
}