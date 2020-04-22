public class UncommonAlphabets {
    public static void main(String[] args) {
        char[] input1 = {'G', 'Q', 'R'};
        char[] input2 = {'R', 'T', 'U'};
        int num1=0;
        int num2=0;

        for (char c : input1) {
            for (char d : input2) {
                if (c==d){
                    num2 = 0;
                    break;
                }
                else{
                    num2 = (int) c;
                }
                
            }
            num1 += num2;
        }

        for (char c : input2) {
            for (char d : input1) {
                if (c==d){
                    num2 = 0;
                    break;
                }
                else{
                    num2 = (int) c;
                }

            }
            num1 += num2;
        }

        System.out.println(SumOfDigits(num1));

    }

    private static int SumOfDigits(int n) {
        if (n == 0)
        return 0;
        return (n % 9 == 0) ? 9 : (n % 9);
    }
}
