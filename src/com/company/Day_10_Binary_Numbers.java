package com.company;

import java.util.Scanner;

/**
 * Given a base-10 integer, n, convert it to binary (base-2).
 * Then find and print the base-10 integer denoting the maximum
 * number of consecutive 1's in n's binary representation.
 */
public class Day_10_Binary_Numbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        Day_10_Binary_Numbers sol = new Day_10_Binary_Numbers();
        String binary = sol.getBinaryString(n);

        System.out.println(sol.countMaxConsecutiveOnes(binary));
    }

    private String getBinaryString(int decimalNumber) {
        return (decimalNumber < 2) ?
                String.valueOf(decimalNumber) :
                getBinaryString(decimalNumber / 2) + decimalNumber % 2;
    }

    private int countMaxConsecutiveOnes(String inputString){
        char[] inputCharArray = inputString.toCharArray();
        int counter = 0;
        int maxCount = 0;

        for(char c:inputCharArray){
            if(c=='1'){
                counter++;
            }else{
                maxCount = Math.max(counter, maxCount);
                counter = 0;
            }
        }
        maxCount = Math.max(counter, maxCount);
        return maxCount;
    }
}
