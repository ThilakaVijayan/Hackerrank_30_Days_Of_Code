package com.company;

import java.util.Scanner;

public class Day_20_Sorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        int swapCount = 0;
        int lastIndex = 0;
        boolean swapped;

        for (int i = n - 1; i >= 0; i--) {
            swapped = false;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapCount++;
                    swapped = true;
                    lastIndex = j + 1;
                }
            }
            if (swapped)
                i = lastIndex;
            else
                break;
        }

        System.out.println("Array is sorted in " + swapCount + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }
}
