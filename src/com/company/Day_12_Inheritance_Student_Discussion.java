package com.company;

public class Day_12_Inheritance_Student_Discussion extends Day_12_Inheritance_Person {
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
    Day_12_Inheritance_Student_Discussion(String firstName, String lastName,
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

