package WiproPrograms;

/*

StepNumber : A number is said to be Step Number if the difference between next or previous digits is 1 or -1
If the given number is a single digit number, it is NOT a STEP NUMBER

input1 - integer
output - input1-true or input1-false
If input1 is a step number, then output would be input-true, else input1-false 

Example 1:
input1: 67898
Hence 67898 is a STEP NUMBER
output: 67898-true

Example 2:
input1: 5
Hence 5 is a single digit number, It is NOT a STEP NUMBER
output: 5-false

Example 3:
input1: 1234347
Hence 1234347 is a NOT a STEP NUMBER
output: 1234347-false

*/

public class IsStepNumber {
    public static void main(String[] args) {
        int input1 = 1234347; // 67898
        String s1 = String.valueOf(input1);
        int len = s1.length();
        int diff;
        boolean flag = false;
        String output;

        if (len > 1) {
            for (int i = 0; i < len - 1; i++) {
                int n1 = Character.getNumericValue(s1.charAt(i));
                int n2 = Character.getNumericValue(s1.charAt(i + 1));
                diff = n2 - n1;
                if (diff == 1 || diff == -1) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        output = String.format("%d-%b", input1, flag);
        System.out.println(output);
    }
}
