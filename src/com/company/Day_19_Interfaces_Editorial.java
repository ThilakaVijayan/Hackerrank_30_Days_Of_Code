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

class Calculator_2 implements AdvancedArithmetic {
    public int divisorSum(int n) {
        // n has no divisors other than itself
        if(n == 1)
            return n;

        // Find and sum divisors:
        int half = n/2;
        int sum = n;

        do
            if(n % half == 0)
                sum += half;
        while( half-- > 1 );

        return sum;
    }
}

public class Day_19_Interfaces_Editorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator_2();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
