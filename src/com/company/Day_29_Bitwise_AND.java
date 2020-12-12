package com.company;

import java.util.Scanner;

public class Day_29_Bitwise_AND {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int result = 0;
            int result2 = 0;

            for (int i = 1; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    int temp = i & j;
                    result = Integer.max(result2, temp);
                    result2 = k > result ? result : result2;
                }
            }
            System.out.println(result2);
        }
        scanner.close();
    }
}
