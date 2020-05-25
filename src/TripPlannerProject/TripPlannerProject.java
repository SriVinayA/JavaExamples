package TripPlannerProject;

import java.util.Scanner;

public class TripPlannerProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        greeting(input);
        seperator();
        timeAndBudget(input);
        seperator();
        timeDifference(input);
        seperator();
        countryArea(input);
        seperator();
    }

    public static void greeting(Scanner input) {
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet " + name + ", where are you travelling to? ");
        String city = input.nextLine();
        System.out.println("Great! " + city + " sounds like a great trip");
    }

    public static void seperator() {
        System.out.println("***********");
        System.out.println();
        System.out.println();
    }

    public static void timeAndBudget(Scanner input) {
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you going to spend on your trip? ");
        int usd = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currencySymbol = input.next();
        System.out.print("How many " + currencySymbol + " are there in 1 USD? ");
        double conversion = input.nextDouble();
        System.out.println();

        int hours = days * 24;
        int minutes = hours * 60;
        double perDay = usd / (1.0 * days);
        double converted = usd * conversion;
        double perDayConverted = usd * conversion / days;

        System.out.println("If you are travelling for " + days + " days that is the same as " + hours + " hours or "
                + minutes + " minutes");
        System.out.printf(
                "If you are going to spend $" + usd + " USD that means per day you can spend up to $%.2f USD\n",
                perDay);
        System.out.printf("Your total budget in " + currencySymbol + " is " + converted + " " + currencySymbol
                + ", which per day is %.2f " + currencySymbol + "\n", perDayConverted);
    }

    public static void timeDifference(Scanner input) {
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        double timeDiff = input.nextDouble();
        System.out.print("That means that when it is midnight at home it will be " + (int) (24 + timeDiff) % 24 + ":00"
                + " in your travel destination \nand when it is noon at home it will be " + (int) (12 + timeDiff) % 24
                + ":00\n");
    }

    public static void countryArea(Scanner input) {
        System.out.print("What is the square area of your destination country in km2? ");
        double km2 = input.nextDouble();
        double miles2 = km2 / 2.59;
        System.out.printf("In miles2 that is %.2f\n", miles2);
    }
}