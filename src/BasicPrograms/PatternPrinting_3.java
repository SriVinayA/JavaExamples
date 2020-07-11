package BasicPrograms;/*

         1
        121
       12321
      1234321
     123454321
    12345654321
   1234567654321
  123456787654321
 12345678987654321
12345678910987654321

 */

public class PatternPrinting_3 {
    public static void main(String[] args) {
        int n = 10;

        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }
            for (int inc = 1; inc <= row; inc++) {
                System.out.print(inc);
            }
            for (int dec = row - 1; dec >= 1; dec--) {
                System.out.print(dec);
            }
            System.out.println();
        }
    }
}
