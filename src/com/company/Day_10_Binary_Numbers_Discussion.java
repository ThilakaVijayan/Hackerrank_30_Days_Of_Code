package com.company;

import java.util.Scanner;

/**
 * Given a base-10 integer, n, convert it to binary (base-2).
 * Then find and print the base-10 integer denoting the maximum
 * number of consecutive 1's in n's binary representation.
 */
public class Day_10_Binary_Numbers_Discussion {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        int rem = 0, counter = 0, max = 0;

        while (n > 0) {
            rem = n % 2;
            if (rem == 1)
                counter++;
            else
                counter = 0;

            max = Math.max(counter, max);
            n = n / 2;
        }
        System.out.println(max);
    }
}
