package com.company;

import java.util.Scanner;

/**
 * Your local library needs your help! Given the expected and actual
 * return dates for a library book, create a program that calculates
 * the fine (if any). The fee structure is as follows:
 * <p>
 * If the book is returned on or before the expected return date,
 * no fine will be charged (i.e.: fine = 0.
 * If the book is returned after the expected return day but still
 * within the same calendar month and year as the expected return date,
 * fine = 15 Hackos x (the number of days late).
 * If the book is returned after the expected return month but still
 * within the same calendar year as the expected return date, the
 * fine = 500 Hackos x (the number of months late).
 * If the book is returned after the calendar year in which it was
 * expected, there is a fixed fine of 10000 Hackos.
 */
public class Day_26_Nested_Logic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int returnedDay = sc.nextInt();
        int returnedMonth = sc.nextInt();
        int returnedYear = sc.nextInt();

        int dueDay = sc.nextInt();
        int dueMonth = sc.nextInt();
        int dueYear = sc.nextInt();

        if (returnedYear < dueYear ||
                (returnedYear == dueYear && returnedMonth < dueMonth) ||
                (returnedYear == dueYear && returnedMonth == dueMonth && returnedDay <= dueDay))
            System.out.println(0);
        else if (returnedYear > dueYear)
            System.out.println(10000);
        else if (returnedMonth > dueMonth)
            System.out.println(500 * (returnedMonth - dueMonth));
        else if (returnedDay > dueDay)
            System.out.println(15 * (returnedDay - dueDay));


    }
}
