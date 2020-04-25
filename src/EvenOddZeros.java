/*

if input is +ve output 1st letter  = p
           else output 1st letter  = n

followed by if even = e, if odd = o, if zero = z

*/

public class EvenOddZeros {
    public static void main(String[] args) {
        int input1 = 163380;
        String str = "";


        if(input1>0){
            str += "p";
        }
        else{
            str += "n";
        }

        String a = String.valueOf(input1);
        for (int i = 0; i < a.length(); i++) {
            int n = a.charAt(i);
            if (Character.getNumericValue(n) == 0) {
                str += "z";
            } else if (Character.getNumericValue(n) % 2==0) {
                str += "e";
            } else {
                str += "o";
            }
        }
        System.out.println(str);
    }
}
