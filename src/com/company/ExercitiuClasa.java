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
        for(i=0; i<=1000; i=i+5) {

            if (i==5||i==55||i==555||i==1000){
                System.out.println(i);
            }

            /*Write a code that reads from the console two positive numbers.
            Then create a loop that counts from 1 until it is equal
            to the second read number and prints the number.
            The increment is the first read number.
            The numbers are read inside main, and they are passed as parameters to another method.
             Obs: Search what System.currentTimeMillis() does. Do you need it somewhere?
             Stop the code after 10 seconds.

             */

            Scanner in = new Scanner(System.in);
            System.out.println("read first number: ");
            int n = Integer.parseInt(in.nextLine());

            System.out.println("read first number: ");
            int m = Integer.parseInt(in.nextLine());

            while (n<0 || m<0) {
                System.out.println("Read first number: ");
                n = Integer.parseInt(in.nextLine());

                System.out.println("Read second number: ");
                m = Integer.parseInt(in.nextLine());

            }




            }






            }


            }













