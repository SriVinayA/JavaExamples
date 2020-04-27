/*

if n=5

    *
   **
  ***
 ****
*****

*/

public class PatternPrinting_2 {
    public static void main(String[] args) {
        int n = 10;

        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < 10-row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
