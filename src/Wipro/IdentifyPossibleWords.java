package Wipro;

import java.util.regex.Pattern;

public class IdentifyPossibleWords {
    public static void main(String[] args) {
        String input1 = "fi_er";
        String input2 = "fever:filer:fixer";

        input1 = input1.toUpperCase().replace("_", ".");
        String[] arr = input2.toUpperCase().split(":");
        StringBuilder result = new StringBuilder();

        for (String s : arr) {
            if (Pattern.matches(input1, s)) {
                result.append(s).append(":");

            }
        }
        if (result.length() > 0) {
            System.out.println(result.toString().replaceAll(".$", ""));
        } else {
            System.out.println("ERROR-009");
        }
    }
}