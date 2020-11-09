package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Given a base-10 integer, n, convert it to binary (base-2).
 * Then find and print the base-10 integer denoting the maximum
 * number of consecutive 1's in n's binary representation.
 */
public class Day_10_Binary_Numbers_Editorial_2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        String[] splitString = Integer.toBinaryString(n).split("0");
        Arrays.sort(splitString);
        System.out.println(splitString[splitString.length-1].length());
    }
}
