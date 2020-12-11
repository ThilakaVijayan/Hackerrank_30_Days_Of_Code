package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Consider a database table, Emails, which has the attributes
 * First Name and Email ID. Given N rows of data simulating the
 * Emails table, print an alphabetically-ordered list of
 * people whose email address ends in @gmail.com.
 */
public class Day_28_RegEx_Patterns_and_Intro_to_Databases {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String> namesList = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            Pattern p = Pattern.compile("[a-z]+@gmail\\.com$");
            Matcher m = p.matcher(emailID);

            if (m.matches()) {
                namesList.add(firstName);
            }
        }


        scanner.close();

        Collections.sort(namesList);

        for (String names : namesList)
            System.out.println(names);
    }
}
