package BasicPrograms;/*

         1
        12A
       123BA
      1234CBA
     12345DCBA
    123456EDCBA
   1234567FEDCBA
  12345678GFEDCBA
 123456789HGFEDCBA
12345678910IHGFEDCBA

 */

public class PatternPrinting_4 {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) { // row
            for (int j = 1; j <= n - i; j++) { // spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) (64 + j));
            }
            System.out.println();
        }
    }
}
