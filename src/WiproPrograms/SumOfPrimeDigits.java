package WiproPrograms;

public class SumOfPrimeDigits {
    public static void main(String[] args) {

        int input1 = 1234561179;
        String s1 = String.valueOf(input1);
        StringBuilder s2 = new StringBuilder();
        int num = 0;
        int len = s1.length();
        String output;

        for (int i = 0; i < len; i++) {
            char n1 = s1.charAt(i);
            int n = Character.getNumericValue(n1);
            String flag = "p";

            if (n == 0 || n == 1) {
                flag = "np";
            } else {
                for (int j = 2; j <= n / 2; ++j) {
                    if (n % j == 0) {
                        flag = "np";
                        break;
                    }
                }
            }

            if (flag.equals("p")) {
                s2.append((char) (n + '0'));
                num += n;
            }
        }

        if (s2.length() == 0) {
            char a = s1.charAt(0);
            char b = s1.charAt(len - 1);
            output = String.format("%c:%c", a, b);
        } else {
            output = String.format("%s:%d", s2.toString(), num);
        }
        System.out.println(output);
    }
}
