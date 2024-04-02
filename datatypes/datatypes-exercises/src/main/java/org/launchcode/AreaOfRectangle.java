package org.launchcode;

import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length of the rectangle:");
        int lenOfRectangle = input.nextInt() ;
        System.out.println("Please enter width of the rectangle:");
        int widthOfRectangle = input.nextInt() ;
        int areaOfRectangle = lenOfRectangle * widthOfRectangle;
        System.out.println("Area of Rectangle is" + areaOfRectangle);
    }
}
