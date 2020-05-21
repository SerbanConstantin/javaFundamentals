package com.company;

import java.util.Scanner;

public class Fibobacci {
    public static void main(String[] args) {
        int a = 1, b = 1, aux, n, count = 1;
        Scanner myNumber = new Scanner(System.in);
        System.out.print("Input number: ");
        n = myNumber.nextInt();
        while (count <= n) {
            System.out.print(a + " ");
            count++;
            aux = b;
            b = a + b;
            a = aux;
        }
    }
}
