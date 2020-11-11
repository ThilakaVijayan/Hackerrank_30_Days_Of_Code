package com.company;

public class Day_12_Inheritance_Student extends Day_12_Inheritance_Person {
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
    Day_12_Inheritance_Student(String firstName, String lastName,
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
        if (90 <= avgScore && avgScore <= 100)
            return 'O';
        else if (80 <= avgScore && avgScore < 90)
            return 'E';
        else if (70 <= avgScore && avgScore < 80)
            return 'A';
        else if (55 <= avgScore && avgScore < 70)
            return 'P';
        else if (40 <= avgScore && avgScore < 55)
            return 'D';
        else
            return 'T';
    }
}

