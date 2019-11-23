package com.company;

public class test5 {
    public static void main(String[] args) {

        int points = 100;
        int age = 101;

        if (points >= 100) {
            System.out.println("You win!");
        }
        if (age < 18) {
            System.out.println("You are teenager!");
        } else {
            System.out.println("You are adult!");
        }
        if (age < 18) {
            System.out.println("You are teenager!");
        } else if (age > 100) {
            System.out.println("You are very old!");
        } else {
            System.out.println("You are adult!");
        }

    }
}
