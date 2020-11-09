package com.company;

import java.util.Scanner;

/**
 * Context
 * Given a 6 x 6 2D Array, A:
 *
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * 0 0 0 0 0 0
 * We define an hourglass in A to be a subset of values with indices falling in
 * this pattern in A's graphical representation:
 *
 * a b c
 *   d
 * e f g
 * There are 16 hourglasses in A, and an hourglass sum is the sum of an hourglass' values.
 *
 * Task
 * Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
 *
 * Input Format
 * There are 6 lines of input, where each line contains 6 space-separated integers
 * describing 2D Array A; every value in A will be in the inclusive range of -9 to 9.
 */
public class Day_11_2D_Arrays_Editorial {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int maxSum = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }

    /*Given the coordinates of the starting point of the hour glass,
    it returns the sum of the hour glass*/
    private int sumOfHourGlass(int[][] arr, int i, int j) {
        int sum = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if ((x == 1 && y == 0) || (x == 1 && y == 2))
                    continue;
                sum = sum + arr[i + x][j + y];
            }
        }
        return sum;
    }
}
