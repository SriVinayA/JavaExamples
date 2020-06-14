import java.util.Random;

public class PrintRandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int input1 = rand.nextInt(6) + 5; // 5 to 10

        System.out.println(input1);
    }
}