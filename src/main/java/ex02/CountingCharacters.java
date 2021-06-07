/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Connor Stanley
 */
package ex02;

import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asking for the user's input string
        System.out.print("What is the input string? ");
        String inputString = in.nextLine();

        // Gathering the string length and storing it within a variable
        int stringLength = inputString.length();

        // Output within a single line
        System.out.print(inputString + " has "+ stringLength + " characters.");

    }
}