package Wipro;

public class SumOfNosInString {
    public static void main(String[] args) {
        String input1 = "1W2i3p4r5o6"; // 12345 //PBL //1W2i3p4r5o6
        int input2 = 1;
        int sum = 0;
        String str = "";

        // NULL
        if (input1.isEmpty()) {
            str = "NULL";
        }

        // Numbers
        else if (input2 == 0) {
            for (int i = 0; i < input1.length(); i++) {
                int a = input1.charAt(i);
                if (Character.isDigit(a)) {
                    sum = sum + Character.getNumericValue(a);
                }
            }
            if (sum == 0) {
                str = "ZERO";
            } else {
                str = Integer.toString(sum);
            }
        }

        // Alphabets
        else if (input2 == 1) {
            for (int i = 0; i < input1.length(); i++) {
                char a = input1.charAt(i);
                if (Character.isAlphabetic(a)) {
                    str += a;
                }
            }
            if (str.equals("")) {
                str = "ZERO";
            }
        }

        System.out.println(str);
    }
}
