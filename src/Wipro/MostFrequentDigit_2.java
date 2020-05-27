package Wipro;

public class MostFrequentDigit_2 {
    public static void main(String[] args) {
        int input1 = 123;
        int input2 = 456;
        int input3 = 345;
        int input4 = 5043;

        long x = Long.parseLong(String.valueOf(input1) + input2 + input3 + input4);
        System.out.println(mostFrequentDigit(x));
    }

    private static int mostFrequentDigit(long x) {

        // Handle negative number
        if (x < 0)
            x = -x;

        // Initialize result which is a digit
        int result = 0;

        // Initialize count of result
        int max_count = 1;

        // Traverse through all digits
        for (int i = 0; i <= 9; i++) {
            // Count occurrences of current digit
            int count = countOccurrences(x, i);

            // Update max_count
            // and result if needed
            if (count >= max_count) {
                max_count = count;
                result = i;
            }
        }
        return result;
    }

    private static int countOccurrences(long x, int i) {
        // Initialize count of digit i
        int count = 0;
        while (x > 0) {
            // Increment count if current digit is same as i
            if (x % 10 == i)
                count++;
            x = x / 10;
        }
        return count;
    }
}