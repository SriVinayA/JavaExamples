/*

if exact multiple return 2 else return 1
if either of the parameters are zero, the function should return 3.

input1 can be any +ve, -ve or zero
input2 will always be >=0

*/

package WiproPrograms;

public class ExactMultiple {
    public static void main(String[] args) {
        int input1 = 8;
        int input2 = 4;
        int output = 0;

        if (input2 > 0) {
            if (input1 % input2 == 0) {
                output = 2;
            } else {
                output = 1;
            }
        }
        if (input1 == 0 || input2 == 0) {
            output = 3;
        }
        System.out.println(output);
    }
}