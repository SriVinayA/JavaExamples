package Inheritance_Examples;

public class My_Calculation extends Calculation {
    public static void main(String[] args) {
        int a = 20, b = 10;
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multiplication(a, b);
    }

    public void multiplication(int x, int y) {
        System.out.println("The product of the given numbers:" + x*y);
    }
}