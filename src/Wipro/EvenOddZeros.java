package Wipro;

/*

if input is +ve output 1st letter  = p
           else output 1st letter  = n

followed by if even = e, if odd = o, if zero = z

if input is zero return "pz"

*/

public class EvenOddZeros {
    public static void main(String[] args) {
        int input1 = 163380;
        StringBuilder str = new StringBuilder();

        if (input1 == 0) {
            str.append("pz");
        } else if (input1 > 0) {
            str.append("p");
        } else {
            str.append("n");
            input1 *= -1;
        }

        String a = String.valueOf(input1);
        if (input1 != 0) {
            for (int i = 0; i < a.length(); i++) {
                int n = a.charAt(i);
                if (Character.getNumericValue(n) == 0) {
                    str.append("z");
                } else if (Character.getNumericValue(n) % 2 == 0) {
                    str.append("e");
                } else {
                    str.append("o");
                }
            }
        }
        System.out.println(str);
    }
}
