package HackerRank;

import java.util.Scanner;

class Loop_1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d%n", N, i, N * i);
        }

    }
}
