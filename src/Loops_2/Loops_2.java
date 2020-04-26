package Loops_2;

import java.util.*;
import java.io.*;

public class Loops_2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int s = 0;
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    s = a + b;
                } else {
                    s += (Math.pow(2, j)) * b;
                }
                System.out.format("%d ", s);
            }
        }
        in.close();

    }
}