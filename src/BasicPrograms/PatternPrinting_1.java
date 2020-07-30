package BasicPrograms;/*

if n=10

1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910

*/

public class PatternPrinting_1 {
    public static void main(String[] args) {
        int n = 10;

        for (int row = 1; row <= n; row++) {
            for (int num = 1; num <= row; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}