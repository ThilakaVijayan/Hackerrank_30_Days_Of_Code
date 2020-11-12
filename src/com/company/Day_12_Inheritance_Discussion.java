package com.company;

import java.util.Scanner;

class Student_Discussion extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student_Discussion(String firstName, String lastName,
                                          int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate() {
        int avg = 0;
        for (int testScore : testScores)
            avg += testScore;
        avg = avg / testScores.length;
        return (avg > 89 ? 'O' : avg > 79 ? 'E' : avg > 69 ?
                'A' : avg > 54 ? 'P' : avg > 39 ? 'D' : 'T');
    }
}

public class Day_12_Inheritance_Discussion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student_Discussion s = new Student_Discussion(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

