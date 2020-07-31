package BasicPrograms;

import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Let’s play a game called “Odds and Evens”");

        System.out.print("What is your name? ");
        String name = sc.next();

        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String OorE = sc.next().toLowerCase();

        if (OorE.equals("o")) {
            System.out.println(name + " has picked odds! The Computer will be evens.");
        } else {
            System.out.println(name + " has picked evens! The Computer will be odds.");
        }

        System.out.println("---------------------------------------");
        System.out.println();

        boolean flag = true;
        System.out.print("How many “fingers” do you put out? ");
        int userNumber = 0;
        while (flag) {
            userNumber = sc.nextInt();
            if (0 <= userNumber && userNumber <= 6) {
                flag = false;
            } else {
                System.out.println("please enter the  between 0 and 6");
            }
        }

        Random rand = new Random();
        int computerNumber = rand.nextInt(6);

        System.out.println("The computer plays " + computerNumber + " \"fingers\".");

        System.out.println("---------------------------------------");
        System.out.println();

        int sum = userNumber + computerNumber;
        System.out.println(userNumber + " + " + computerNumber + " = " + sum);

        boolean oddOrEven = sum % 2 == 0;

        if (oddOrEven) {
            System.out.println(sum + " is ...even!");
        } else {
            System.out.println(sum + " is ...odd!");
        }

        if (oddOrEven) {
            if (OorE.equals("e")) {
                System.out.println("That means " + name + " wins! :)");
            } else {
                System.out.println("That means computer wins!");
            }
        } else {
            if (OorE.equals("o")) {
                System.out.println("That means " + name + " wins! :)");
            } else {
                System.out.println("That means Computer wins!");
            }
        }

        System.out.print("---------------------------------------");

        sc.close();
    }
}