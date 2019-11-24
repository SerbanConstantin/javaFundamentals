package com.company;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

import java.util.Scanner;

public class ExercitiuClasa4 {

    /*Create a program that reads a text from the keyboard.
     Create a method that prints the letters and the numbers of apparitions in the read text.
     */
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        String prop = x.next ();
        System.out.println (prop);
        char[] litere = new char[prop.length ()];
        int[] count = new int[prop.length ()];
        for (int i = 0; i < prop.length (); i++) {
            for (int j = 0; j <= i; j++) {
                if (litere[j] == prop.charAt (i)) {
                    count[j]++;
                } else {
                    litere[i] = prop.charAt (i);
                }            }
        }
        afisare (litere);
        afisare (count);
    }    private static void afisare(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println (array[i]);
        }
        System.out.println ();
    }    private static void afisare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println (array[i]);
        }
        System.out.println ();
    }
}


