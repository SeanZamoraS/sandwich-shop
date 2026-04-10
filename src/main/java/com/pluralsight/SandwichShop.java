package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double lSandwich = 8.95;
        double sSandwich = 5.45;
        double lLoaded = 1.75;
        double sLoaded = 1.00;

        double sandwichTotal = 0;

        int customerAge = 0;
        String sandwichSelection = " ";
        String loadedSelection = " ";

        System.out.println("""
        Hello welcome to the sandwich shop.\s
        Would you like a small sandwich or a large sandwich?""");


        sandwichSelection = input.nextLine();

        if (sandwichSelection.equalsIgnoreCase("small")) {
            sandwichTotal = sSandwich;

            System.out.println("\nWould you like that sandwich loaded for $1.00 extra? (y/n): ");

            loadedSelection = input.nextLine();

            if (loadedSelection.equalsIgnoreCase("y")) {
                sandwichTotal += sLoaded;
            }
            else if (loadedSelection.equalsIgnoreCase("n")) {
                sandwichTotal += 0;
            }
            else {
                System.out.println("\nPlease answer y or n next time.");
                System.exit(0);
            }
        }
        else if (sandwichSelection.equalsIgnoreCase("large")) {
            sandwichTotal = lSandwich;

            System.out.println("\nWould you like that sandwich loaded for $1.75 extra? (y/n): ");
            loadedSelection = input.nextLine();

            if (loadedSelection.equalsIgnoreCase("y")) {
                sandwichTotal += lLoaded;
            }
            else if (loadedSelection.equalsIgnoreCase("n")) {
                sandwichTotal += 0;
            }
            else {
                System.out.println("\nPlease answer y or n next time.");
                System.exit(0);
            }
        }
        else {
            System.out.println("\nPlease make a valid selection next time.");
            System.exit(0);
        }

        System.out.println("""
        \nWe have a discount for youth and seniors.
        How old are you?\n""");

        try {
            customerAge = input.nextInt();
        }
        catch (Exception e) {
            System.out.println("Please input a valid age next time.");
            System.exit(0);
        }

        sandwichTotal = discount(customerAge, sandwichTotal);

        //test
        //System.out.println(sandwichTotal);

        System.out.printf("\nAlright, your total is $%.2f.\n", sandwichTotal);
        System.out.println("Thank you for visiting the sandwich shop");


    }

    public static double discount(int age, double total) {

        if (age >= 65) {
            total *= 0.8;
            return total;
        }
        else if (age <= 17) {
            total *= 0.9;
            return total;
        }
        else {
            System.out.println("\nNo discounts apply in that case.");
            return total;
        }

    }
}