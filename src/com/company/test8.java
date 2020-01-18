package com.company;

public class test8 {
    public static void main(String[] args) {
        System.out.println(Math.max(4, 5));
        System.out.println(Math.min(4, 7));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.abs(-2.5));
        System.out.println(Math.random());
        int x = 5;
        int y = 10;
        //Math.max(x, y);
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));
        System.out.println(Math.random());

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false
        System.out.println();

        int a = 10;
        int b = 9;
        System.out.println(a > b); // returns true, because 10 is higher than 9
        System.out.println(10 > 9); // returns true, because 10 is higher than 9

        int c = 10;
        System.out.println(c == 10); // returns true, because the value of c is equal to 10
        System.out.println(10 == 15); // returns false, because 10 is not equal to 15
        System.out.println();

        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        if (x < y) {
            System.out.println("x is smaller than y");
        }
        System.out.println();
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");// Outputs "Good evening."

        }
        System.out.println();

        int timp = 22;
        if (timp < 10) {
            System.out.println("Good morning.");
        } else if (timp < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");// Outputs "Good evening."

        }
        System.out.println();
        int timpi = 20;
        String result = (timpi < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


    }


}
