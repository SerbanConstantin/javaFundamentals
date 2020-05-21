package com.company;


import java.util.Scanner;

public class ArrayExemple {
    public static void main(String[] args) {
        String[] arrayOfstrings = new String[5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arrayOfstrings.length; i++) {
            System.out.print("arrayOfStrings[" + i + "]=");
            arrayOfstrings[i] = in.nextLine();
        }

        /**
         * using enhanced for write the array
         * format : (x,x,x,x,x,)
         */

        System.out.print("(");
        for (String ss : arrayOfstrings) {
            if (ss == (arrayOfstrings[4])) {
                System.out.print(ss);
            } else {
                System.out.print(ss + ",");
            }


        }
        System.out.print(")");
    }
}