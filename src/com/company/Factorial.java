package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n is: ");
        int n = scanner.nextInt();
        int result = 1;
        int i;
        for (i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println(String.format("%d! = %d ", n, result));
    }
}
