/*
 * Decreasing sequence: 
 * Given an integer array, find the number of decreasing
 * sequences in the array and the length of its longest decreasing sequence. 
 * 
 * You are expected to complete the logic within the given function, 
 * where, 
 * input1 represents the integer array and, 
 *  represents the number of elements in the integer array 
 * 
 * The function should set the output1 variable to the number of decreasing 
 * sequences in the array, and set the output2 variable to the length of the longest 
 * decreasing sequence in the array. 
 * 
 * Example 1: 
 * If input1[] = {11,3,1,4,7,8,12,2,3,7} 
 * and  = 10 
 * output1 should be 2
 * output2 should be 3 
 * 
 * Explanation: 
 * In the given array input1, the decreasing sequences are "11,3,1" and "12,2", i.e. 
 * there are two decreasing sequences in the array, and so outputl is assigned 2. 
 * The first sequence i.e. "11,3,1" is the longer one containing three items, when 
 * compared to the second sequence "12,2" which contains 2 items. So, the length 
 * of the longest decreasing sequence output2 = 3. 
 * 
 * Example 2: 
 * If input1[] = {9} 
 * and  = 1 
 * output1 should be 0 
 * output2 should be 0 
 * 
 * Example 3: 
 * If input1[] = {12,51,100,212,15,12,7,3,57,300,312,78,19,100,102,101, 99,74, 0,-5} 
 * and  = 20 
 * output1 should be 3 
 * output2 should be 6
 */

package WiproPrograms;

public class DecreasingSequence {
    public static void main(String[] args) {
        int[] input1 = { 11, 3, 1, 4, 7, 8, 12, 2, 3, 7 };
        int input2 = input1.length; // ans -> 2 and 3

        int k = 0;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < input2 - 1; i++) {
            if (input1[i] > input1[i + 1]) {
                if (k == 0) {
                    count++;
                }
                k++;
                sum = Math.max(sum, k);
            } else {
                k = 0;
            }
        }
        sum = (count > 0) ? (sum + 1) : sum;
        System.out.printf("%d, %d", count, sum);
    }
}