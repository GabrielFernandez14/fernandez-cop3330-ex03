
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Gabriel Fernandez
 */

package org.example;
import java.util.Scanner;

public class App {

    // Main function
    public static void main(String[] args) {
        // Prompt the user for input, and scan until the next line is reached
        // Store the scanner input into the String datatype that is quote
        System.out.println("What is the quote?");
        Scanner quoteInput = new Scanner(System.in);
        // .nextLine() scans the string until a new line character (\n) is reached
        String quote = quoteInput.nextLine();

        // Repeat for the author
        System.out.println("Who said it?");
        Scanner authorInput = new Scanner(System.in);
        String author = authorInput.nextLine();

        // Print out the exit statement, with "\"" surrounding the quote
        System.out.println(author + " says, " + "\"" + quote + "\"");
    }
}
