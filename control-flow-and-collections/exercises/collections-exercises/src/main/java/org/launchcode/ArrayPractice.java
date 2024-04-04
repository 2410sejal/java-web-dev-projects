package org.launchcode;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class ArrayPractice {
    public static void main (String[] args){
      int[] array = {1, 1, 2, 3, 5, 8};
     for (double newArray : array){
         if(newArray%2 !=0) {
             System.out.println(newArray);
         }
     };
     String sentence ="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
     String[] sentenceArray = sentence.split("\\.");
     System.out.println(Arrays.toString(sentenceArray));
    }
}
