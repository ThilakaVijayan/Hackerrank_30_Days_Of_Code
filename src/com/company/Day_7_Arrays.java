package com.company;

import java.util.Scanner;

/**
 * Given an array, A, of N integers, print A's elements in reverse order as a single line of
 * space-separated numbers.
 */
public class Day_7_Arrays {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        scanner.close();

        for(int i = n-1; i >=0; i--){
            System.out.print(arr[i]);
            if(i>0){
                System.out.print(" ");
            }
        }
    }
}
