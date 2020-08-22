/*
Akash and Vishal are quite fond of travelling. They mostly travel by railways. They were travelling in a train one
day and they got interested in the seating arrangement of their compartment. The compartment looked something like

So they got interested to know the seat number facing them and the seat type facing them. The seats are denoted as
follows :

Window Seat : WS
Middle Seat : MS
Aisle Seat : AS

You will be given a seat number, find out the seat number facing you and the seat type, i.e. WS, MS or AS.

INPUT
First line of input will consist of a single integer T denoting number of test-cases. Each test-case consists of a
single integer N denoting the seat-number.

OUTPUT
For each test case, print the facing seat-number and the seat-type, separated by a single space in a new line.

CONSTRAINTS
1<=T<=105 1<=N<=108

SAMPLE INPUT:
2
18
40

SAMPLE OUTPUT:
19 WS
45 AS
*/
package HackerEarth;

import java.util.Scanner;

public class Seating_Arrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int j = 0; j < t; j++) {
            int mod12 = arr[j] % 12;
            switch (mod12) {
                case 1 -> System.out.println((arr[j] + 11) + " WS");
                case 2 -> System.out.println((arr[j] + 9) + " MS");
                case 3 -> System.out.println((arr[j] + 7) + " AS");
                case 4 -> System.out.println((arr[j] + 5) + " AS");
                case 5 -> System.out.println((arr[j] + 3) + " MS");
                case 6 -> System.out.println((arr[j] + 1) + " WS");
                case 7 -> System.out.println((arr[j] - 1) + " WS");
                case 8 -> System.out.println((arr[j] - 3) + " MS");
                case 9 -> System.out.println((arr[j] - 5) + " AS");
                case 10 -> System.out.println((arr[j] - 7) + " AS");
                case 11 -> System.out.println((arr[j] - 9) + " MS");
                case 0 -> System.out.println((arr[j] - 11) + " WS");
            }
        }
    }
}
