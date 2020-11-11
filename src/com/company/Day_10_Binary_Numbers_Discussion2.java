package com.company;

import java.util.Scanner;

/**
 * Given a base-10 integer, n, convert it to binary (base-2).
 * Then find and print the base-10 integer denoting the maximum
 * number of consecutive 1's in n's binary representation.
 */
public class Day_10_Binary_Numbers_Discussion2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        int consec1=0;
        String strBinary = Integer.toString(n, 2);
        // above is binary of given in in string

        String[] strparts = strBinary.split("0");
        //above we get all strings of ones, below find max from them

        for (String strpart : strparts)
            if (consec1 < strpart.length())
                consec1 = strpart.length();

        System.out.println(consec1);  //result
    }
}
