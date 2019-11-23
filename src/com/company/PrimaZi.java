package com.company;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.awt.image.ShortLookupTable;

public class PrimaZi {

    public static void main1(String[] args) {
        // write your code here
        System.out.println("Salut");
        boolean firstBoolean;
        firstBoolean = true;
        System.out.println(firstBoolean);

        boolean hasChildren = false;
        System.out.println(hasChildren);

        boolean hasThreeChildren = true;
        boolean Has3Children = true;
        byte firstByteDeclaration = 23;
        System.out.println(firstByteDeclaration);

        firstByteDeclaration = -12;
        System.out.println(firstByteDeclaration);

        firstByteDeclaration = 0;
        System.out.println(firstByteDeclaration - 1);

        firstByteDeclaration = 127;
        System.out.println(firstByteDeclaration + 120);

        firstByteDeclaration = (byte) (firstByteDeclaration + 1);
        System.out.println(firstByteDeclaration);

        System.out.println("Byte max and min value");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println("short datatype");
        short variableOn16Bits = 16000;
        variableOn16Bits = (short) (variableOn16Bits * 2);
        System.out.println(variableOn16Bits);


        System.out.println("integer datatype");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int myIntNumber = 2_000_000;
        System.out.println(myIntNumber);

        System.out.println("Long datatype");
        long aVeryLargeValue = variableOn16Bits * myIntNumber;
        System.out.println(aVeryLargeValue);

        System.out.println("Real datatype");
        float aFloatValue = 6;
        System.out.println(aFloatValue);
        System.out.println(aFloatValue / 5);

        int testDivision = 6 / 4;
        System.out.println(testDivision);

        aFloatValue = (float) 6.3;
        aFloatValue = 6.3f;

        float periodValue = (float) 2 / 3;
        System.out.println(periodValue);

        double periodValueDouble = (double) 2 / 3;
        System.out.println(periodValueDouble);


    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 5;
        System.out.println(a + b + c);
        int sum = a + b + c;
        System.out.println(sum);

        int product = a * b;
        System.out.println(product);

        double division = (double) b / c;
        System.out.println(division);

        int diff = c - a;
        System.out.print("c - a = ");
        System.out.println(diff);

        System.out.println("a ");
        System.out.println(a);
        a = a + 2;
        System.out.println(a);
        a += 2;
        System.out.println(a);

        System.out.println(b);
        b -= 1;
        System.out.println(b);

        System.out.println(c);
        c *= 2;
        System.out.println(c);
        c /= 2;
        System.out.println(c);

        System.out.println(a);
        a += 1;
        System.out.println(a);
        a++;
        System.out.println(a);

        System.out.println("Unary operator");
        a = 7;
        b = 9;
        int newSum = (++a) + (b++);
        System.out.println(newSum);
        System.out.println(a);
        System.out.println(b);

        int x = 4;
        System.out.println(x++);
        System.out.println(--x);
        System.out.println(x % 3);
        System.out.println(11 / 2);
        System.out.println(7 % x++);
        System.out.println(x == 4);
        System.out.println(x != 4);

        x = 10;
        int y = 5;
        System.out.println(x == 10 && y <= 5);
        System.out.println(x <= y && y > 5);
        System.out.println("abc" instanceof String);

        System.out.println("Hello world");
        System.out.println("salut");
        System.out.println("Buhuhuuu");

        String firstName = "John";
        System.out.println(firstName);
        String lastName = "Doe";
        System.out.println(lastName);
        String fullName = firstName + lastName;
        System.out.println(fullName);


        int myNum = 15;
        float myFloatNum = 5.99f;
        char myLetter = 'C';
        boolean myBool = true;
        String myText = "hello";
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        float f1 = 35e3f;
        double d1 = 12e4d;
        System.out.println(f1);
        System.out.println(d1);

        String str = "Hello World";
        System.out.println(str);


    }


}






















