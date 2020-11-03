package com.company;

import java.util.Scanner;

/**
 * Complete the code in the editor below. The variables i,d, and s are already declared and initialized
 * for you. You must:
 *
 * Declare 3 variables: one of type int, one of type double, and one of type String.
 * Read 3 lines of input from stdin (according to the sequence given in the Input Format section below)
 * and initialize your  variables.
 * Use the + operator to perform the following operations:
 * Print the sum of i plus your int variable on a new line.
 * Print the sum of d plus your double variable to a scale of one decimal place on a new line.
 * Concatenate s with the string you read as input and print the result on a new line.
 * Note: If you are using a language that doesn't support using + for string concatenation (e.g.: C),
 * you can just print one variable immediately following the other on the same line. The string provided
 * in your editor must be printed first, immediately followed by the string you read as input.
 */

public class Day_1_Data_Types {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int j;
        double d2;
        String s2;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial
        // closely.
        j = scan.nextInt();
        d2 = scan.nextDouble();
        scan.nextLine();
        s2 = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+j);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d+d2);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */

        System.out.println(s + s2);

        scan.close();
    }
}
