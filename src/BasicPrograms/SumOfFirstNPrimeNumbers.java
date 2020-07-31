package BasicPrograms;

public class SumOfFirstNPrimeNumbers {
    public static void main(String[] args) {
        int count = 15;
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
        System.out.println(sum);
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
}
