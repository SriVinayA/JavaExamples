/*
 * AdditionUsingStrings: 
 * Write a function that takes two numbers in string
 * format and forms a string containing the sum (addition) of these two numbers.
 * 
 * Assumption(s):
 * The input strings will contain only numeric digits
 * The input strings can be of any large lengths 
 * The lengths of the two input string need not be the same
 * The input strings will represent only positive numbers 
 * 
 * For example - 
 * If input strings are "1234" and "56" the output string should be "1290"
 * If input strings are "56" and "1234" the output string should be "1290"
 * If input strings are "123456732128989543219" and "987612673489652", the 
 * output string should be "123457719741663032871" 
 * 
 * NOTE:
 * In Java & C#, this logic can be easily implemented using BigInteger. However
 * for the sake of enhancing your programming skills, you are recommended to
 * solve this question without using BigInteger.
 */

package Wipro;

public class AdditionUsingStrings {
    public static void main(String[] args) {
        String input1 = "123456732128989543219";
        String input2 = "987612673489652";
        System.out.println(findSum(input1, input2));
    }

    // Function for finding sum of larger numbers
    static String findSum(String input1, String input2) {
        // Before proceeding further, make sure length
        // of input2 is larger.
        if (input1.length() > input2.length()) {
            String t = input1;
            input1 = input2;
            input2 = t;
        }

        // Take an empty String for storing result
        StringBuilder str = new StringBuilder();

        // Calculate length of both String
        int n1 = input1.length(), n2 = input2.length();
        int diff = n2 - n1;

        // Initially take carry zero
        int carry = 0;

        // Traverse from end of both Strings
        for (int i = n1 - 1; i >= 0; i--) {
            // Do school mathematics, compute sum of
            // current digits and carry
            int sum = ((input1.charAt(i) - '0') + (input2.charAt(i + diff) - '0') + carry);
            str.append((char) (sum % 10 + '0'));
            carry = sum / 10;
        }

        // Add remaining digits of input2[]
        for (int i = n2 - n1 - 1; i >= 0; i--) {
            int sum = ((input2.charAt(i) - '0') + carry);
            str.append((char) (sum % 10 + '0'));
            carry = sum / 10;
        }

        // Add remaining carry
        if (carry > 0)
            str.append((char) (carry + '0'));

        // reverse resultant String
        return new StringBuilder(str.toString()).reverse().toString();
    }
}