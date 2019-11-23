package com.company;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        int a;
        a = 3;
        int b;
        b = 5;
        int c;
        c = 4;

        System.out.println(a + " " + b + " " + c);

        String s1 = new String("java");
        String s2 = new String("java");
        String s3 = s2;

        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // true

        String str = null;
        System.out.println(str); // null
        str = "hello";
        System.out.println(str); // hello

        int x = 4;
        System.out.println(x++); //printeaza x si apoi adauga +1 la x si salveaza in memorie, nu afiseaza ce a salvat
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x % 3);
        System.out.println(11 % 2);
        System.out.println(7 % x++);
        System.out.println(x == 4);
        System.out.println(x != 4);
        x = 10;
        int y = 5;
        System.out.println(x == 10 && y <= 5);
        System.out.println(x <= y && y > 5);

        String f = "abc";
        String g = new String("abc");
        System.out.println(f == g);
        System.out.println(f.equals(g));

        String h = "Hello";
        String i = "World!";
        String text = h + "," + i;
        System.out.println(text);

        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        boolean descOrdered = (h1 >= h2) && (h2 >= h3);

        System.out.println(descOrdered);


    }

}
