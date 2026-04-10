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

        System.out.println("""
        Hello welcome to the sandwich shop.\s
        Would you like a small sandwich or a large sandwich? \n""");


        sandwichSelection = input.nextLine();

        if (sandwichSelection.equalsIgnoreCase("small")) {
            sandwichTotal = sSandwich;
        }
        else if (sandwichSelection.equalsIgnoreCase("large")) {
            sandwichTotal = lSandwich;
        }
        else {
            System.out.println("\nPlease make a valid selection next time.");
            System.exit(0);
        }

        System.out.println("""
        \nWe have a discount for youth and seniors.
        How old are you?\n""");









    }

    public static double discount(int customerAge, double sandwichTotal) {

        if (customerAge >= 65) {
            return sandwichTotal *= 0.8;
        }
        else if (customerAge <= 17) {
            return sandwichTotal *= 0.9;
        }
        else {
            System.out.println("\nProceeding with no discounts.");
            return sandwichTotal;
        }

    }
}