package com.company;

public class Day_12_Inheritance_Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Day_12_Inheritance_Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}


