/*
 * input1 = 12, input2 = 1313, input3 = 122, input4 = 678, input5 = 898
 * answer = 983
 * 
 * input1 = 455, input2 = 257, input3 = 3300, input4 = 110, input5 = 303
 * answer = 2689
 */

package Wipro;

public class FindPasswordStableUnstable {
    public static void main(String[] args) {
        int input1 = 12, input2 = 1313, input3 = 122, input4 = 678, input5 = 898;
        int[] arr = { input1, input2, input3, input4, input5 };
        for (int i : arr) {
            if (checkStable(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkStable(int i) {
        return false;
    }
}