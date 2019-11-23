package com.company;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();


        switch (ss.charAt(0)) {
            case 'n':
                System.out.println("You are going North!");
                break;
            case 's':
                System.out.println("You are going South!");
                break;
            case 'e':
                System.out.println("You are going East!");
                break;
            case 'w':
                System.out.println("You are going West!");
                break;
            default:
                System.out.println("Bad direction!");
        }
    }
}