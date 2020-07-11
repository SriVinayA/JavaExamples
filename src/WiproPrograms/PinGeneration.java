/*
PIN Generation:
    unit's place = smallest number among unit's places of the inputs
    ten's place = smallest number among ten's places of the inputs
    hundred's place = smallest number among hundred's places of the inputs
    thousands 's place = largest number among all the digits of the inputs

*/

package WiproPrograms;

public class PinGeneration {
    public static void main(String[] args) {
        int input1 = 190, input2 = 267, input3 = 853; // 9150

        String str1 = String.valueOf(input1);
        String str2 = String.valueOf(input2);
        String str3 = String.valueOf(input3);
        char hun = smallNumber(str1.charAt(0), str2.charAt(0), str3.charAt(0));
        char ten = smallNumber(str1.charAt(1), str2.charAt(1), str3.charAt(1));
        char unit = smallNumber(str1.charAt(2), str2.charAt(2), str3.charAt(2));

        char g1 = largeNumber(str1.charAt(1), str1.charAt(2), str1.charAt(0));
        char g2 = largeNumber(str2.charAt(1), str2.charAt(2), str2.charAt(0));
        char g3 = largeNumber(str3.charAt(1), str3.charAt(2), str3.charAt(0));

        char thous = largeNumber(g1, g2, g3);

        String output = String.format("%c%c%c%c", thous, hun, ten, unit);

        System.out.println(Integer.valueOf(output));
    }

    public static char largeNumber(char a, char b, char c) {
        int a1 = Character.getNumericValue(a);
        int b1 = Character.getNumericValue(b);
        int c1 = Character.getNumericValue(c);
        int output = Math.max(c1, (Math.max(a1, b1)));
        return (char) (output + '0');
    }

    public static char smallNumber(char a, char b, char c) {
        int a1 = Character.getNumericValue(a);
        int b1 = Character.getNumericValue(b);
        int c1 = Character.getNumericValue(c);
        int output = Math.min(c1, (Math.min(a1, b1)));
        return (char) (output + '0');
    }
}