package com.company;

import java.util.Scanner;

/**
 * The AdvancedArithmetic interface and the method declaration for the abstract
 * divisorSum(n) method are provided for you in the editor below.
 * <p>
 * Complete the implementation of Calculator class, which implements the
 * AdvancedArithmetic interface. The implementation for the divisorSum(n) method
 * must return the sum of all divisors of n.
 */
interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator_1 implements AdvancedArithmetic {
    public int divisorSum(int n) {
       if (n < 1)
            throw new IllegalArgumentException();

        if (n == 1)
            return 1;

        double sqRoot = Math.sqrt(n);
        int sum = 1 + n;
        for (int i = 2; i < sqRoot; i++) {
            if (n % i == 0) {
                sum += i;
                sum += n / i;
            }
        }
        if (n % sqRoot == 0)
            sum += sqRoot;

        return sum;
    }
}

public class Day_19_Interfaces {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator_1();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
