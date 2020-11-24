package com.company;

import java.util.*;

public class Day_16_Exceptions_String_to_Integer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try{
            System.out.println(Integer.parseInt(S));
        }catch (NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}
