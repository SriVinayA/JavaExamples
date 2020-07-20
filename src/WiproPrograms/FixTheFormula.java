/*
Fix the Formula:
---------------
Kely has been tricked by her brother to answer a question with a number. She is perplexed. 
Here is the question "Fo+23the3*like2+" it took time for her to understand. Now she wants
to automate it with a program so that any time her brother comes with such tricky String 
She could answer with lesser efforts. 

Here is what we have to do, separate the math operators and the digits. 
Like in the above String you can see the operators (+, *, +) and digits (2, 3, 3, 2). 
Rest all characters are ignored. 

Now arrange the digits and operators in the order of the appearance to get the correct 
result. 
2+3*3+2 to be solved as 
(2+3) = 5 
Then, (5*3) = 15 
Then, (15+2) =17 
So for the given String "Fo+23the3*like2+" final answer is 17 

Help Kely by writing a program to solve the above given problem.  
Prototype: public int fixTheFormula(String input1) 

Assumptions:
-----------
1. Numbers present in the String are always considered as single digits (0-9)
2. Only operators used in the String are (+, *, +)
3. Always we will have length +1 numbers to operators (In the above example 3 operators and 4 numbers).

----------------------------------------------------------------------------------------
Sample Input/Output-1:
----------------------
input1= we8+you2-7to/*32
output= 2 

Explanation: Here the operators are [+, -, /, *] and the numbers are [8, 2, 7, 3, 2] 
Thus we would be getting 8+2 => 10-7 => 3/3 => 1*2 => 2
Final answer is 2. 
----------------------------------------------------------------------------------------
Sample Input/Output-2: 
----------------------
input1= i*-t5s-t8h1e4birds
output= 35 
Explanation: Here the operators are [*, -, -] and the numbers are [5, 8, 1, 4] 
Thus we would be getting 5*8 => 40-1 => 39-4 => 35 
Final answer is 35. 
----------------------------------------------------------------------------------------
*/

package WiproPrograms;

class FixTheFormula {
    public static void main(String[] args) {
        String input1 = "Fo+23the3*like2+";
        System.out.println(fixTheFormula(input1));
    }

    private static int fixTheFormula(String input1) {
        String numberString = "";
        String operatorString = "";
        int len = input1.length();

        for(int i=0; i<len; i++){
            char ch = input1.charAt(i);
            if(!Character.isAlphabetic(ch)){
                if(Character.isDigit(ch))
                    numberString += (ch + " ");
                else
                    operatorString += (ch + " ");
            }
        }

        String[] numberArray = numberString.split(" ");
        String[] operatorArray = operatorString.split(" ");

        int sum = calculate(numberArray, operatorArray);

        return sum;
    }
    private static int calculate(String[] numberArray, String[] operatorArray){
        int len = numberArray.length;

        int sum = switch (operatorArray[0]) {
            case "+" -> Integer.parseInt(numberArray[0]) + Integer.parseInt(numberArray[1]);
            case "-" -> Integer.parseInt(numberArray[0]) - Integer.parseInt(numberArray[1]);
            case "/" -> Integer.parseInt(numberArray[0]) / Integer.parseInt(numberArray[1]);
            case "*" -> Integer.parseInt(numberArray[0]) * Integer.parseInt(numberArray[1]);
            default -> 0;
        };

        for(int i=2; i<len; i++){
            int num = Integer.parseInt(numberArray[i]);
            switch (operatorArray[i - 1]) {
                case "+" -> sum += num;
                case "-" -> sum -= num;
                case "/" -> sum /= num;
                case "*" -> sum *= Integer.parseInt(numberArray[i]);
            }
        }
        return sum;
    }
}