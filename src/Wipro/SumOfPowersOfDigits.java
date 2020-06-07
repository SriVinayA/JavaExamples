package Wipro;

public class SumOfPowersOfDigits {
    public static void main(String[] args) {
        int input1 = 586329;

        String str = String.valueOf(input1);
        int sum = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            int a = Character.getNumericValue(str.charAt(i));
            int b = Character.getNumericValue(str.charAt(i + 1));
            sum += Math.pow(a, b);
        }
        sum++;
        System.out.println(sum);
    }
}