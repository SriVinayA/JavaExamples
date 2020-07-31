package WiproPrograms;

public class WeightOfTheHillPattern {
    public static void main(String[] args) {
        int input1 = 4;
        int input2 = 1;
        int input3 = 5;
        int sum = 0;

        for (int i = 1; i <= input1; i++) {
            sum += (input2 * i);
            input2 += input3;
        }
        System.out.println(sum);
    }
}