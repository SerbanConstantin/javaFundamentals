package com.company;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ExercitiuClasa {
    /*Write a piece of code that counts from 1 to 1000, with increments of 5.
    It prints to the console only the numbers composed of the same digit.
    Use all 3 loop operators. The code shall be placed in a new method, called from main
    Also print the last number
     */

    public static void main(String[] args) {

        ExercitiClasa();


    }

    private static void ExercitiClasa() {
        int i;
        for (i = 0; i <= 1000; i = i + 5) {

            if (i == 5 || i == 55 || i == 555 || i == 1000) {
                System.out.println(i);
            }
        }
    }
}
































