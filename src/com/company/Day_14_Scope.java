package com.company;

import java.util.Scanner;

/**
 * Complete the Difference class by writing the following:
 *
 * A class constructor that takes an array of integers as a parameter
 * and saves it to the elements instance variable.
 * A computeDifference method that finds the maximum absolute difference
 * between any 2 numbers in N and stores it in the maximumDifference instance variable.
 */
class Difference_Editorial {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference_Editorial(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        maximumDifference = 0;
        for (int i = 0; i < elements.length; i++)
            for (int j = i + 1; j < elements.length; j++)
                maximumDifference = Math.max(maximumDifference, Math.abs(elements[i] - elements[j]));
    }
} // End of Difference class

public class Day_14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference_Editorial difference = new Difference_Editorial(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
