package Wipro;

public class EvenorOddSumDigit {
    public static void main(String[] args) {
        int input1 = 108;
        String input2 = "even";

        int sum = 0;
        String a = String.valueOf(input1);

        for (int i = 0; i < a.length(); i++) {
            int num = Character.getNumericValue(a.charAt(i));
            if (input2.equals("even")) {
                if (num % 2 == 0) {
                    sum += num;
                }
            } else {
                if (num % 2 == 1) {
                    sum += num;
                }
            }
        }
        System.out.println(sum);
    }
}