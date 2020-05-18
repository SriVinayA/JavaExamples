/* 

input1 = 582109
(5+8+2+1+0+9) + (8+2+1+0+9) + (2+1+0+9) + (1+0+9) + (0+9) + (9)
 = 25 + 20 + 12 + 10 + 9 + 9 = 85

*/
package Wipro;

public class SumOfSumsOfDigitsInCyclicOrder {
    public static void main(String[] args) {

        int input1 = 582109;

        String str = String.valueOf(input1);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                sum += Character.getNumericValue(str.charAt(j));
            }
        }
        System.out.println(sum);
    }
}