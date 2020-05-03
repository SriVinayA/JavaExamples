package Wipro;

public class CountEven {
    public static void main(String[] args) {
        int intput1 = 12;
        int intput2 = 17;
        int intput3 = 19;
        int intput4 = 14;
        int intput5 = 115;

        int[] intput = { intput1, intput2, intput3, intput4, intput5 };
        int num = 0;

        for (int i = 0; i < intput.length; i++) {
            if (intput[i] % 2 == 0) {
                num++;
            }
        }
        System.out.println(num);
    }
}