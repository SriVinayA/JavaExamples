import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter any Year : ");
        int year = sc.nextInt();
        boolean leap = false;

        if (year%4==0) {
            if (year%100==0) {
                if (year%400==0) 
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if (leap) {
            System.out.format("%d is a leap year", year);
        } else {
            System.out.format("%d is not a leap year", year);
        }

        sc.close();
    }
}
