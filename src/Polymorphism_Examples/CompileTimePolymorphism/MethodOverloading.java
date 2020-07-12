package Polymorphism_Examples.CompileTimePolymorphism;

class MultiplyFun {
    static int Multiply(int a, int b) {
        return a * b;
    }

    static double Multiply(double a, double b) {
        return a * b;
    }
}

class MethodOverloading {
    public static void main(String[] args) {

        System.out.println(MultiplyFun.Multiply(2, 4));

        System.out.println(MultiplyFun.Multiply(5.5, 6.3));
    }
}