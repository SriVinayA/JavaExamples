package JavaInputMethods;

import java.util.Scanner;

/*
    Method					        Description
    int nextInt()-------------------It is used to scan the next token of the input as an integer.
    float nextFloat()---------------It is used to scan the next token of the input as a float.
    double nextDouble()-------------It is used to scan the next token of the input as a double.
    byte nextByte()-----------------It is used to scan the next token of the input as a byte.
    String nextLine()---------------Advances this scanner past the current line.
    boolean nextBoolean()-----------It is used to scan the next token of the input into a boolean value.
    long nextLong()-----------------It is used to scan the next token of the input as a long.
    short nextShort()-----------	It is used to scan the next token of the input as a Short.
    BigInteger nextBigInteger()-----It is used to scan the next token of the input as a BigInteger.
    BigDecimal nextBigDecimal()-----It is used to scan the next token of the input as a BigDecimal.
*/
public class ScannerClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer : ");
        int a = sc.nextInt();

        System.out.print("Enter a Float : ");
        float b = sc.nextFloat();

        System.out.print("Enter a String : ");
        String c = sc.next();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();

    }
}
