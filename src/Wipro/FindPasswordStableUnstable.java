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
        int stable = 0;
        int unstable = 0;

        for (int i : arr) {
            if (checkStable(i)) {
                stable += i;
            } else {
                unstable += i;
            }
        }
        System.out.println(stable - unstable);
    }

    private static boolean checkStable(int input) {
        String str = String.valueOf(input);
        int num = 0;
        boolean isStable = true;
        int[] arr1 = new int[10];

        for (int i = 0; i < str.length(); i++) {
            arr1[Character.getNumericValue(str.charAt(i))]++;
        }

        for (int value : arr1) {
            if (value > 0) {
                num = value;
                break;
            }
        }

        for (int value : arr1) {
            if (value != 0 && value != num) {
                isStable = false;
                break;
            }
        }
        return isStable;
    }
}