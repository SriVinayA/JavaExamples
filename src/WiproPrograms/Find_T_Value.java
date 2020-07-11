/*
Find T Value:
------------
Danielle was assigned the task of finding the T-Value by her Manager. She was
given a function called find_tvalue and was provided with 3 integer numbers
input1, input2 and input3. She is expected to return an integer value by following
the two rules:

Rule_1: There are four cases possible based on the value of input2.
	Case 1:
		if input2 is an even prime number then
		Calculate t = input1*input1*(sum of first input2 number of prime numbers).
	Case 2:
		if input2 is an odd prime number then
		Calculate t = input2*input2*(sum of first input3 number of prime numbers)
	Case 3:
		if input2 is an even composite number then
		Calculate t = input3*input3*(sum of first (input2+input3) number of prime numbers)
	Case 4:
		if input2 is an odd composite number then
		Calculate t = sum of first (inputl+input2+input3) prime numbers
	Case 4:
		if input2 is an odd composite number then
		Calculate t = sum of first (inputl+input2+input3) prime numbers 
Rule_2: There are two cases possible based on the value of t, which is computed in the above step. 
	Case 1:
		if the above value "t" is a prime, then return t+input3;
	Case 2:
		if the above value "t" is a not a prime, then return t-input3;

Assumptions:
Value of input1 is >=1 and input1<=1000.
Value of input2 is >=2 and input2<=1000.
Value of input3 is >=1 and input3<=1000.
The first prime number 2. And, the Prime numbers series is 2,3,5,7, 11,13...etc. 
The number which is not prime is called as composite number.
Number 1 is neither prime nor composite.

Syntax:
int find_tvalue(int input1 int input2, int input3);
-----------------------------------------------------------------------------
Sample Input/Output-1: 
inputl=1
input2=2
input3=1
output=6

Explanation:
Applying rule_1:
	input2=2 is an even prime number. So Find t = 1*1*(sum of first 2 prime numbers).
	t = 1*1*(2+3) = 1*1*5 = 5. 
Applying rule_2: 
	Now, t=5 is odd prime. so, return t+input3; that is 5+1;
	Hence 6 is the value returned. 
-----------------------------------------------------------------------------
Sample Input/Output-2:
input1=1
input2=5
input3=15
output=8185 

Explanation :
Applying rule_1:
	input2=5 is an odd prime. So, t = input2*input2*(sum of first 15 prime numbers)
	t= 5*5*(2+3+5+7+11+13+17+19+23+29+31+37+41+43+47)
	t = 25*(328) = 8200.
Applying rule2:
	Now, t=8200 is not a prime number. So, return t-input3 ; that is 8200-15 = 8185;
	Hence, 8185 is the value returned.
-----------------------------------------------------------------------------
*/

package WiproPrograms;

public class Find_T_Value {
    public static void main(String[] args) {
        int input1 = 1;
        int input2 = 5;
        int input3 = 15;
        int t;
        int output;

        // Applying Rule_1
        if (isPrime(input2)) {
            if (isEven(input2))
                t = input1 * input1 * sumOfPrimes(input2);
            else
                t = input2 * input2 * sumOfPrimes(input3);
        } else {
            if (isEven(input2))
                t = input3 * input3 * sumOfPrimes(input2 + input3);
            else
                t = sumOfPrimes(input1 + input2 + input3);
        }

        // Applying Rule_2
        if (isPrime(t))
            output = t + input3;
        else
            output = t - input3;

        System.out.println(output);
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

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int sumOfPrimes(int count) {
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
        return sum;
    }
}