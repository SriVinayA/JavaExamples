package BasicPrograms;

public class NumberSumtoSingleDigit {
    public static void main(String[] args) {
        int input = 1223; // 1 + 2 + 2 + 3 = 8
        if (input == 0)
            System.out.println(0);
        System.out.println((input % 9 == 0) ? 9 : (input % 9));
    }
}