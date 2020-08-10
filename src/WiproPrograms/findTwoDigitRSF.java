package WiproPrograms;

public class findTwoDigitRSF {
    public static void main(String[] args) {
        int input1 = 6972;
        String input = String.valueOf(input1);
        while(input.length()!=2) {
            input = rsf(input);
        }
        System.out.println(Integer.valueOf(input));
    }
    public static String rsf(String input) {
        String res = "";
        for(int i=0; i<input.length()-1; i++) {
            char ch1 = input.charAt(i);
            char ch2 = input.charAt(i+1);
            int d = Math.abs(Character.getNumericValue(ch1) - Character.getNumericValue(ch2));
            res += d;
        }
        return res;
    }
}
