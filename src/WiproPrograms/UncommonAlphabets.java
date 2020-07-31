package WiproPrograms;

/*


1: Extract the alphabets which are present only in any one of the array(Uncommon alphabets)
2: Get the ascii values of all the extracted alphabets
3: Calculate the sum of those ascii values, let us call it as sum1 and calulate single digit sum of sum1
	i.e, keep adding the digits until you arrive at a single digit
4: Return the single digit as output

Note:
1. Array size ranges from 1 to 15
2. All the array elements are upper case alphabets

Example1:
input1: {'A', 'B', 'C'}
input2: {'B', 'C'}
output : 65 => 6+5 = 11
		   => 1+1 = 2

Example2:
input1: {'G', 'Q', 'R'}
input2: {'R', 'T', 'U'}
output : 71 + 81 + 84 + 85 = 321
		     => 3 + 2 + 1 = 6


 */

public class UncommonAlphabets {
    public static void main(String[] args) {
        char[] input1 = { 'G', 'Q', 'R' };
        char[] input2 = { 'R', 'T', 'U' };
        int num;

        num = getSum(input1, input2);
        num += getSum(input2, input1);

        System.out.println(SumOfDigits(num));
    }

    public static int SumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 9 == 0) ? 9 : (n % 9);
    }

    public static int getSum(char[] input1, char[] input2) {
        int num1 = 0;
        int num2 = 0;
        for (char c : input1) {
            for (char d : input2) {
                if (c == d) {
                    num2 = 0;
                    break;
                } else {
                    num2 = c;
                }

            }
            num1 += num2;
        }
        return num1;
    }
}