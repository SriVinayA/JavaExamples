package BasicPrograms;

import java.util.Scanner;

public class RootsQuadraticEquation {
    public static void main(String[] args) {

        double root1;
        double root2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values for a,b,c in ax2+bx+c=0");
        System.out.print("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b : ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c : ");
        double c = sc.nextDouble();

        double determinant = (b * b) - (4 * a * c);

        if (determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);

        } else if (determinant == 0) {
            root1 = root2 = (-b) / (2 * a);

            System.out.format("root1 = root2 = %.2f", root1);

        } else if (determinant < 0) {
            double realPart = (-b) / (2 * a);
            double imaginaryPart = (Math.sqrt(-determinant)) / (2 * a);

            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart,
                    imaginaryPart);

        }
        sc.close();
    }
}
