package com.company;

public class Day_12_Inheritance_Student_Editorial extends Day_12_Inheritance_Person {
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
    Day_12_Inheritance_Student_Editorial(String firstName, String lastName,
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

