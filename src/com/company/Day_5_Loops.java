package com.company;

import java.util.Scanner;

/**
 * Given an integer, n, print its first 10 multiples. Each multiple n X i (where 1 <= i <= 10)
 * should be printed on a new line in the form: n x i = result.
 */
public class Day_5_Loops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        for(int i=1; i <=10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}



