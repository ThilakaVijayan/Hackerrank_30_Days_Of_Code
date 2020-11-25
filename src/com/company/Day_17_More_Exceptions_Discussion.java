package com.company;

import java.util.Scanner;

/**
 * Write a Calculator class with a single method: int power(int,int).
 * The power method takes two integers, n and p, as parameters and
 * returns the integer result of n^p. If either n or p is negative, then
 * the method must throw an exception with the message: n and p should
 * be non-negative.
 */
//Write your code here
class Calculator_Discussion{
    public int power(int n, int p) throws IllegalArgumentException{
        if (n < 0 || p < 0){
            throw new IllegalArgumentException("n and p should be non-negative");
        }

        int power = 1;
        for(int i = 0; i < p; i++){
            power *= n ;
        }
        return power;
    }
}

public class Day_17_More_Exceptions_Discussion{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator_Discussion myCalculator = new Calculator_Discussion();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
