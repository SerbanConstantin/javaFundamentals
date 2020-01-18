package com.company;

public class CelMaiMareDivizorComun {
    public static void main(String[] args) {
        int a = 24;
        int b = 132;
        while (a != b) {
            if (a < b) {
                b = b - a;

            } else {
                a = a - b;

            }

        }
        System.out.println(a);

    }
}

