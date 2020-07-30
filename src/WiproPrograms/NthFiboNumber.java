package WiproPrograms;

public class NthFiboNumber {
    public static void main(String[] args) {
        int input1 = 7;
        int a = 0, b = 1, c;
        if (input1 == 0 || input1 == 1)
            System.out.println(a);
        for (int i = 2; i <= input1; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}
