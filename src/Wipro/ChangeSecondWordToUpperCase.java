package Wipro;

public class ChangeSecondWordToUpperCase {
    public static void main(String[] args) {
        String input1 = "Wipro Technologies Bangalore";
        String[] strArray = input1.split(" ");
        String output;

        if (strArray.length < 2) {
            output = "LESS";
        } else {
            output = strArray[1].toUpperCase();
        }
        System.out.println(output);
    }
}