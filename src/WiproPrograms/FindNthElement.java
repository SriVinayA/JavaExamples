/*
Generate series and find Nth element: 
Given three numbers a, b and c, such that 
either 
a<b<c 
or
a>b>c 
and 
a, b, and c can be positive, negative or zero. 
Form the series such that the gap between c and its next element (say d) should be the 
same as the gap between a and b. Similarly, the gap between c's next element (d) and d's 
next element (say e) should be the same as the gap between b and c. 
Find and return the Nth element.

Example1- if the three numbers are a=1, b=3, c=6 and N=17 
The series will be formed as below — 
17th number in the series is 41 

Example2- If the three numbers are a=5, b=-2, c=-4 and N=14 
The series will be formed as below — 
14th number in the series is -56
*/
package WiproPrograms;

public class FindNthElement {
    public static void main(String[] args) {
        int a=1, b=3, c=6, N=17;

        int gap1 = (b - a);
		int gap2 = (c - b);
		int output = a;
			
		for (int i = 1; i < N; i++) {
			if (i % 2 == 1)
				output += gap1;
			else
				output += gap2;
		}
		
		System.out.println(output);
    }
}