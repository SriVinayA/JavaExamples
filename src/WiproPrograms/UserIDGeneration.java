/*
String input1 = "Rajiv"; 
String input2 = "Roy"; 
int input3 = 560037; 
int input4 = 6;
----------------------------------
ANSWER = YrAJIV75
----------------------------------

String input1 = "Manoj";
String input2 = "Kumar";
int input3 = 561327;
int input4 = 2;
----------------------------------
ANSWER = RmANOJ62
----------------------------------

String input1 = "Kumud";
String input2 = "Kumar";
int input3 = 561327;
int input4 = 2;
----------------------------------
ANSWER = RkUMUD62
----------------------------------
 */

package WiproPrograms;

public class UserIDGeneration {
    public static void main(String[] args) {
        String input1 = "Kumud";
        String input2 = "Kumar";
        int input3 = 561327;
        int input4 = 2;

        String smallerName = "";
        String longerName = "";
        String str;
        int len1 = input1.length();
        int len2 = input2.length();

        if (len1 < len2) {
            smallerName = input1;
            longerName = input2;
        } else if (len1 > len2) {
            smallerName = input2;
            longerName = input1;
        } else if (len1 == len2) {
            if (input1.compareTo(input2) < 0) {
                smallerName = input1;
                longerName = input2;
            } else if (input1.compareTo(input2) > 0) {
                smallerName = input2;
                longerName = input1;
            } else {
                smallerName = longerName = input1;
            }
        }

        str = smallerName.substring(smallerName.length() - 1) + longerName + pinCode(input3, input4);

        System.out.println(oppositeCase(str));
    }

    private static String pinCode(int pin, int input4) {
        String str = String.valueOf(pin);
        return "" + str.charAt(input4 - 1) + str.charAt(str.length() - input4);
    }

    private static String oppositeCase(String str) {
        StringBuilder strB = new StringBuilder(str);
        int len = strB.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                strB.setCharAt(i, Character.toLowerCase(ch));
            else
                strB.setCharAt(i, Character.toUpperCase(ch));
        }
        return strB.toString();
    }
}