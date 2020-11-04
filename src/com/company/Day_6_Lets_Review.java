package com.company;

import java.io.*;
import java.util.*;

/**
 * Given a string, S, of length N that is indexed from 0 to N-1, print its
 * even-indexed and odd-indexed characters as 2 space-separated strings on a single line.
 *
 * Note: 0 is considered to be an even index.
 */
public class Day_6_Lets_Review {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Day_6_Lets_Review sol = new Day_6_Lets_Review();
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < N; i++){
            String s = scanner.nextLine();
            sol.splitSting(s);
        }
        scanner.close();
    }

    public void splitSting(String inputString){
        char[] charArray = inputString.toCharArray();
        StringBuilder firstString = new StringBuilder();
        StringBuilder secondString = new StringBuilder();
        for(int i = 0; i < charArray.length; i++){
            if(i%2 == 0){
                firstString.append(charArray[i]);
            }else{
                secondString.append(charArray[i]);
            }
        }
        System.out.println(firstString.toString() + " " + secondString.toString());
    }
}

