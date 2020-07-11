package WiproPrograms;

public class SumOfNonPrimeIndexes {
    public static void main(String[] args) {
        int[] input1 = { -1, -2, -3, 3, 4, -7 }; // answer -> (-1) + (-2) + 4 = 1
        int input2 = input1.length;

        int sum = input1[0] + input1[1];
        if (input2 > 2) {
            for (int i = 2; i < input2; i++) {
                if (!checkPrime(i)) {
                    sum += input1[i];
                }
            }
        }
        System.out.println(sum);
    }

    public static boolean checkPrime(int num) {
        boolean k = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                k = false;
                break;
            }
        }
        return k;
    }

}