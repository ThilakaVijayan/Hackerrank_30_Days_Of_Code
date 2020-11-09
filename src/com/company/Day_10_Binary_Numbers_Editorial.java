package com.company;

import java.util.Scanner;

/**
 * Given a base-10 integer, n, convert it to binary (base-2).
 * Then find and print the base-10 integer denoting the maximum
 * number of consecutive 1's in n's binary representation.
 */
public class Day_10_Binary_Numbers_Editorial {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        char[] inputCharArray = Integer.toBinaryString(n).toCharArray();
        int counter = 0;
        int maxCount = 0;

        for (char c : inputCharArray) {
            counter = c == '1' ? ++counter : 0;
            maxCount = Math.max(counter,maxCount);
        }
        System.out.println(maxCount);
    }
}
