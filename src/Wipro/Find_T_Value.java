package Wipro;

public class Find_T_Value {
    public static void main(String[] args) {
        int input1 = 1;
        int input2 = 5;
        int input3 = 15;
        int t;
        int output;

        // Applying Rule_1
        if (isPrime(input2)) {
            if (isEven(input2))
                t = input1 * input1 * sumOfPrimes(input2);
            else
                t = input2 * input2 * sumOfPrimes(input3);
        } else {
            if (isEven(input2))
                t = input3 * input3 * sumOfPrimes(input2 + input3);
            else
                t = sumOfPrimes(input1 + input2 + input3);
        }

        // Applying Rule_2
        if (isPrime(t)) {
            output = t + input3;
        } else {
            output = t - input3;
        }

        System.out.println(output);
    }

    public static boolean isPrime(int n) {
        if (n != 2 && n != 3) {
            if (n % 2 == 0)
                return false;
            for (int j = 3; j <= (n / 2) + 1; j = j + 2) {
                if (n % j == 0)
                    return false;
            }
        }
        return true;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int sumOfPrimes(int count) {
        int sum = 0;
        int n = 2;
        for (int i = 0; i < count; i++) {
            if (n == 2) {
                sum += n;
                n++;
            } else {
                while (!isPrime(n)) {
                    n = n + 2;
                }
                sum += n;
                n = n + 2;
            }
        }
        return sum;
    }
}
