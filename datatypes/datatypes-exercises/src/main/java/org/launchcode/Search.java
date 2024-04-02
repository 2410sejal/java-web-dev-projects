package org.launchcode;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, ‘and what is the use " +
                "of a book,’ thought Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word to search");
        String inputWord = input.next();

        if( text.toLowerCase().contains(inputWord.toLowerCase())){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int index = text.toLowerCase().indexOf(inputWord.toLowerCase());
        int length = inputWord.length();
        System.out.println("Word " + inputWord + " of length " + length + " is found at index " + index);
        String updatedText = text.toLowerCase().replace(inputWord.toLowerCase(), "");
        System.out.println(updatedText);

    }
}
