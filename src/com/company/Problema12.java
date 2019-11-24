package com.company;

import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args) {
    Punct1();
    }

    public static void Punct1(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Dimensiune array: ");
        int dim = scan.nextInt();
        int[] array = new int[dim];

        for (int i = 0; i < dim; i++) {
            System.out.println("array[" + (i + 1) + "]=");
            array[1] = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i<dim; i++){
            sum = sum + array[i];

        }
        System.out.println("Suma elementelor din array: " + sum);

    }
}
