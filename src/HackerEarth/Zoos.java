/*
You are required to enter a word that consists of x and y that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if 2*x=y.

Determine if the entered word is similar to word zoo.

For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.

Input format
    First line: A word that starts with several Zs and continues by several Os.
    Note: The maximum length of this word must be 20.

Output format
    Print Yes if the input word can be considered as the string zoo otherwise, print No.

SAMPLE INPUT:
zzzoooooo

SAMPLE OUTPUT:
Yes
*/

package HackerEarth;

import java.util.Scanner;

public class Zoos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int[] arr = {0, 0};

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z') arr[0]++;
            else if (str.charAt(i) == 'o') arr[1]++;
        }
        if (2*arr[0]==arr[1]) System.out.print("Yes");
        else System.out.print("No");
    }
}
