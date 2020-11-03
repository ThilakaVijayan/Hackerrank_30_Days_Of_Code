package com.company;

import java.util.Scanner;

/**
 * Given an integer,n, perform the following conditional actions:
 *
 * If n is odd, print Weird
 * If n is even and in the inclusive range of 2 to 5, print Not Weird
 * If n is even and in the inclusive range of 6 to 20, print Weird
 * If n is even and greater than 20, print Not Weird
 * Complete the stub code provided in your editor to print whether or not n is weird.
 */

public class Day_3_Intro_to_Conditional_Statements {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if(N%2 != 0){
            System.out.println("Weird");
        }else{
            if(2 <= N && N <= 5){
                System.out.println("Not Weird");
            }else if (6 <= N && N <= 20){
                System.out.println("Weird");
            }else {
                System.out.println("Not Weird");
            }
        }
    }
}

