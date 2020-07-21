/*
Given two strings input1 and input2 consisting of random alphabets,
find whether all the alphabets in input1 are in either increasing or decreasing
order based on their ascii value.

For Example,
input1 = "ACZa", its in increasing order. (65, 67, 90, 97)
input1 = "tbGB", its in decreasing order. (116, 98, 71, 66)
In case if input1 is not in either increasing or decreasing order, directly return
Invalid.
After deciding input1 as increasing or decreasing. Consider input2 which
consists of
the same alphabets which are in input1, but the order of the alphabets may
change.

For Example,
input1 = "ACZa" input2 = "CAZa" here 'C' and 'A' are misplaced in input2, so the
count of alphabets which are misplaced is 2.
input1 = "tbGB" input2 = "tGBb" here 'G', 'B', 'b' are misplaced in input2, so the
count of alphabets which are misplaced is 3.
Expected output format : <Increasing or Decreasing>:count of alphabets which are misplaced is input2.

Example 1:
----------
input1 = "ACZa"
input2 = "CAZa"
output = Increasing:2

Example 2:
----------
input1 = "tbGB"
input2 = "tGBb"
output = Decreasing:3

Example 3:
----------
input1 = "ILkQwfg"
input2 = "QwILkfg"
output = Invalid
Explanation: The alphabets in input1 are not in either increasing or decreasing
order

Note:
1. input1 and input2 will be of same length.
2. input1 and input2 will contain unique alphabets in them.
3. 'B' and 'b' are considered as different alphabets because there ascii values
    are different.
*/

package WiproPrograms;

public class FindTheOrder {
    public static void main(String[] args) {
        String input1 = "ACZa";
        String input2 = "CAZa";

        System.out.println(findTheOrder(input1, input2));
    }

    private static String findTheOrder(String input1, String input2) {
        String output;
        int[] arr = new int[input1.length()];

        for (int i = 0; i < input1.length(); i++) {
            char ch = input1.charAt(i);
            arr[i] = ch;
        }

        String IncDec = IncreasingOrDecreasing(arr);
        if(IncDec.equals("Invalid")) return "Invalid";
        else
            output = String.format("%s:%d", IncDec, Math.abs(input1.compareTo(input2)));

        return output;
    }

    private static String IncreasingOrDecreasing(int[] arr) {
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
            return "Increasing";
        else if (dec)
            return "Decreasing";
        else
            return "Invalid";
    }
}