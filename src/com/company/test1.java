package com.company;

import javax.sound.midi.Soundbank;

public class test1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, Costi!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("It’s a great day, to learn something new");
        System.out.println("Hello,");
        System.out.println("World!");

        System.out.println("Salut");
        boolean firstBoolean;
        firstBoolean = true;
        System.out.println(firstBoolean);

        int x;
        x = 19;
        System.out.println(x);

        double y;
        y = 187.5445;
        System.out.println(y);

        System.out.println("byte datatype");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println("short datatype");
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println("integer datatype");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println("float datatype");
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        System.out.println("double datatype");
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        System.out.println("short datatype");
        short variableOn16Bits = 16000;
        variableOn16Bits = (short) (variableOn16Bits * 2);
        System.out.println(variableOn16Bits);

        System.out.println("Real datatype");
        float aFloatValue = 6;
        System.out.println(aFloatValue);
        System.out.println(aFloatValue / 5);
        System.out.println(aFloatValue / 4);

        int a = 6;
        int b = 11;
        System.out.println(a + b);
        int sum = a + b;
        System.out.println(sum);

        int product = a * b;
        System.out.println(product);

        double division = (double) b / a;
        System.out.println(division);

        int diff = b - a;
        System.out.print("b - a = ");
        System.out.println(diff);

        System.out.println(Integer.MAX_VALUE + 1);

        int e = 10;
        System.out.println(e);
        int f = 25;
        System.out.println(f);
        int g = e + f;

        System.out.println("Sum of e+f = " + g);

        System.out.println("I ");
        System.out.println("know ");
        System.out.println("Java ");
        System.out.println("well.");

        System.out.println("Java is a popular programming language.");
        System.out.println(); // prints empty line
        System.out.println("It is used all over the world!");

        System.out.print("I ");
        System.out.print("know ");
        System.out.print("Java ");
        System.out.print("well.");
        System.out.println();

        System.out.println("1");
        System.out.print("2");
        System.out.println("3");
        System.out.println();
        System.out.println("4");

        System.out.print("**");
        System.out.println();
        System.out.println("**");
        System.out.print("**");

        System.out.println("first");
        System.out.println("second");
        System.out.println("third");

        System.out.println("WE NEED TO ");
        System.out.println();
        System.out.println("LEARN JAVA ");
        System.out.println();
        System.out.println("AS QUICKLY AS POSSIBLE ");

        System.out.println("o x x");
        System.out.println("o x o");
        System.out.println("x o x");
        System.out.println();


        String dayOfWeek = "Monday";
        System.out.println(dayOfWeek);
        dayOfWeek = "Tuesday";
        System.out.println(dayOfWeek);


        int one = 1;
        System.out.println(one);


        int points = 0;
        if (points >= 100) {
            System.out.println("You win!");
        }
        int age = 0;
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

            String s = "abc";
            String t = "abc";
            String w = new String("abc");
            System.out.println(s == t);
            System.out.println(s.equals(t));
            System.out.println(t == w);
            System.out.println(t.equals(w));




        }
    }
}
