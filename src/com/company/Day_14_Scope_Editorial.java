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
class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] elements) {
        this.elements = elements;
    }

    /** Finds max abs difference
     *   Saves it to maximumDifference. **/
    public void computeDifference(){
        // set max to its minimum possible value set by Constraints
        int max = 1;

        // set min to its maximum possible value set by Constraints
        int min = 100;
        for(int element : elements){
            min = Math.min(element,min);
            max = Math.max(element,max);
        }

        this.maximumDifference = Math.abs(max - min);
    }
} // End of Difference class

public class Day_14_Scope_Editorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
