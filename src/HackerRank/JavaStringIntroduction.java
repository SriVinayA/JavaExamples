/*

The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters, A and B, perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than  B(i.e.: does B come before A in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.

Input Format
------------
The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.

Output Format
-------------
There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

Sample Input 0
--------------
hello
java

Sample Output 0
---------------
9
No
Hello Java

Explanation 0
-------------
String  is "hello" and  is "java".

A has a length of 5, and B has a length of 4; the sum of their lengths is 9.
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, A is not greater than B and the answer is No.

When you capitalize the first letter of both A and B and then print them separated by a space, you get "Hello Java".

*/

package HackerRank;

import java.util.Scanner;

public class JavaStringIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = "hello";
        String B = "java";
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());

        int k = A.compareTo(B);
        if (k > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String str1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String str2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(str1 + " " + str2);
        sc.close();
    }
}
