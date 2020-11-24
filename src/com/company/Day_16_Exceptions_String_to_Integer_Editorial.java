package com.company;

import java.util.Scanner;

public class Day_16_Exceptions_String_to_Integer_Editorial {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)){
            System.out.println(Integer.parseInt(in.next()));
        }catch (NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}
