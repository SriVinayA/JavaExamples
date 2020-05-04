/* 

input1 = 582109
(5+8+2+1+0+9) + (8+2+1+0+9) + (2+1+0+9) + (1+0+9) + (0+9) + (9)
 = 25 + 20 + 12 + 10 + 9 + 9 = 85

*/
package Wipro;

public class SumOfSumsOfDigitsInCyclicOrder {
    public static void main(String[] args) {

        int input1 = 582109;

        String num = String.valueOf(input1);
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            for (int j = i; j < num.length(); j++) {
                sum += Integer.parseInt(String.valueOf(num.charAt(j)));
            }
        }
        System.out.println(sum);
    }
}