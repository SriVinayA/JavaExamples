public class SwapNumbers {
    public static void main(String[] args) {
        float first = 12.0f;
        float second = 24.5f;

        System.out.println("-----Before Swapping-----");
        System.out.println("a = "+first);
        System.out.println("b = "+second);

        first = first - second;
        second = first + second;
        first = second - first;


        System.out.println("-----After Swapping-----");
        System.out.println("a = "+first);
        System.out.println("b = "+second);
    }
}
