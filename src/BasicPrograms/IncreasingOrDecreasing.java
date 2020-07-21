package BasicPrograms;

public class IncreasingOrDecreasing {
    public static void main(String[] args) {
        int[] arr = { 116, 98, 71, 66 };
        int n = arr.length, i = 0;
        boolean inc = true, dec = true;

        while ((inc || dec) && i < n - 1) {
            if (arr[i] < arr[i + 1])
                dec = false;
            else if (arr[i] > arr[i + 1])
                inc = false;
            i++;
        }

        if (inc)
            System.out.println("Increasing Order");
        else if (dec)
            System.out.println("Decreasing Order");
        else
            System.out.println("Invalid");
    }
}