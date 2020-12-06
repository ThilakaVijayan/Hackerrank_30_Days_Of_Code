package com.company;

import java.util.Scanner;

/**
 * A prime is a natural number greater than 1 that has no positive divisors
 * other than 1 and itself. Given a number, n, determine and print whether
 * it is Prime or Not prime.
 */
public class Day_25_Running_Time_and_Complexity_Editorial {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Day_25_Running_Time_and_Complexity_Editorial sol = new Day_25_Running_Time_and_Complexity_Editorial();
        for (int i = 0; i < n; i++) {
            double number = sc.nextDouble();
            if (sol.isPrime(number)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }

    public boolean isPrime(double n) {
        if (n == 1)
            return false;
        if (n == 2)
            return true;

        double sqRoot = Math.sqrt(n);
        for (double i = 3; i <= sqRoot; i+=2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
