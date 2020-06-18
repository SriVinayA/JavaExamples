package Wipro;

import java.util.ArrayList;

public class NambiarNumberGenerator {
    public static void main(String[] args) {
        String input1 = "9860857152"; // answer = 3687
        StringBuilder output = new StringBuilder();
        ArrayList<Integer> al = fun(input1, new ArrayList<>());
        for (Integer integer : al) {
            output.append(integer);
        }
        System.out.println(output);
    }

    public static ArrayList<Integer> fun(String input, ArrayList<Integer> al) {
        int len = input.length();
        int sum = Character.getNumericValue(input.charAt(0));
        if (len > 1) {
            fun1(input, al, len, sum);
        } else {
            al.add(sum);
        }
        return al;
    }

    public static void fun1(String input, ArrayList<Integer> al, int len, int sum) {
        for (int i = 1; i < len; i++) {
            int num1 = Character.getNumericValue(input.charAt(i));
            if (num1 % 2 == 0) {
                sum += num1;
                if (i == len - 1) {
                    al.add(sum);
                    break;
                }
            } else {
                sum += num1;
                al.add(sum);
                if (i == len - 1) {
                    al.add(sum);
                    break;
                }
                fun(input.substring(i + 1), al);
                break;
            }
        }
    }
}