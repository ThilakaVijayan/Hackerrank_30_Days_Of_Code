package com.company;

import java.util.Scanner;

class Student_Editorial extends Person {
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
    Student_Editorial(String firstName, String lastName,
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
        return calculateGrade(calculateAverage());
    }

    private int calculateAverage() {
        int total = 0;
        for (int i : testScores) {
            total = total + i;
        }
        return total / testScores.length;
    }

    private char calculateGrade(int avgScore) {
        if (90 <= avgScore)
            return 'O';
        else if (80 <= avgScore)
            return 'E';
        else if (70 <= avgScore)
            return 'A';
        else if (55 <= avgScore)
            return 'P';
        else if (40 <= avgScore)
            return 'D';
        else
            return 'T';
    }
}


public class Day_12_Inheritance_Editorial {
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

        Student_Editorial s = new Student_Editorial(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

