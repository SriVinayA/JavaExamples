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
