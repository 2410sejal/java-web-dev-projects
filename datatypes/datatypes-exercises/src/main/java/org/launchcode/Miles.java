package org.launchcode;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Total miles");
        double miles = input.nextDouble();

        System.out.println("Total Gas");
        double gallons = input.nextDouble();

        double milesPerGallon = miles / gallons;
        System.out.println("Total miles per gallon is " + milesPerGallon);
    }
}
