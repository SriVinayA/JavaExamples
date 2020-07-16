/*

calculate total LETTERS weight of the string, special characters are ignored.

a=A=1, b=B=2, and so on..

if input2 = 0, vowels are ignored
if input2 = 1, including vowels and consonants

input1 = "Hello world"
input2 = 0
output = 89

input1 = "Hello world"
input2 = 1
output = 124

*/

package WiproPrograms;

public class WeightOfString {
    public static void main(String[] args) {
        String input1 = "Hello World";
        int input2 = 1;
        int sum = 0;
        String s = input1.toUpperCase();
        int len = input1.length();
        for (int i = 0; i < len; i++) {
            char letter = s.charAt(i);
            if (Character.isAlphabetic(letter)) {
                if ((input2 == 0)
                        && (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'))
                    sum = sum;
                else
                    sum += letter - 64;
            }
        }
        System.out.println(sum);
    }
}