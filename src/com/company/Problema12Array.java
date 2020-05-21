package com.company;

import java.util.Scanner;

/*
    12. Create an application with a menu and with accepting parameters when starting.
        We are going to create a jar and run it with some arguments.
        Create a menu that will enable you to select the desired functionality
            and will stop when the read data is equal to a certain parameter out of the command line.
            E.g: the app will be customized to display the name of the user -u name -q "exit prog". Etc.
        **) Save the current time that you opened the app. You should have an option in the menu that prints the time spent in the app.
        Write a Java program to find the second largest element in an array.
        Write a Java program to find the number of even and odd integers in a given array of integers
        Write a Java program to compute the average value of an array of integers except the largest and smallest values
        Write a Java program to cyclically rotate a given array clockwise by one
        Create a program that reads a number in a method. Then create another method that can print a reverse triangle of the size given by the parameter
            ****
            * *
             *
        Create a program that reads two numbers. Then create another method that can print a rectangle of the size given by the parameter. Create also another method that can print the rectangle and the diagonals.
        Read a seuqnce of numbers separated by space. Print the sum of them and product. Also the difference between the biggest and the smallest.
        Read a sequence of numbers from the keyboard separated by ;. Print the new numbers as a difference between the sum of the others and the actual number
        Read a big number from the keyboard (let' say 20 digits). Compute the division by a one digit number.
     */

public class Problema12Array {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        int optiune;
        do {
            System.out.println("1. Write a Java program to sum values of an array. Read the size and read the numbers\n" +
                    "2. Write a Java program to calculate the average value of array elements\n" +
                    "3. Write a Java program to remove a specific element from an array. Also change the size of the array\n" +
                    "4. Write a Java program to insert an element (specific position) into an array\n" +
                    "5. Write a Java program to find the second largest element in an array.\n" +
                    "6. Write a Java program to find the number of even and odd integers in a given array of integers\n" +
                    "0. Exit\n");
            System.out.print("Please select an option:");
            optiune = Integer.parseInt(first.next());
            switch (optiune) {
                case 1:
                    Punct1(first);
                case 2:
                    Punct2(first);
                case 3:
                    punctul3(first);
                case 4:
                    punctul4(first);
                case 5:
                    Punctul5(first);
                case 6:
                    Punctul6(first);
                default:
                    System.out.println("Invalid option");
            }
        } while (optiune != 0);
    }

    public static void Punct1(Scanner scan) {
        System.out.print(" Dimensiune array");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        System.out.println(" Suma elementelor din array: " + sumaArray(array));
    }

    public static void Punct2(Scanner scan) {
        //Write a Java program to calculate the average value of array elements
        System.out.print("Citeste dimensiunea: ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        System.out.print("Media average este: ");
        int medie = sumaArray(array) / dim;
        System.out.println(medie);
    }

    public static void punctul3(Scanner in) {
        System.out.println("Dati dimensiune: ");
        int dim = in.nextInt();
        int[] array = readArray(in, dim);
        System.out.println("Dimensiunea initiala este:" + array.length);
        printArray(array);
        System.out.println("Dati indexul elementului:");
        int index = in.nextInt();
        array = extractpossition(array, index);
        System.out.println("Dimensiunea finala:" + array.length);
    }

    public static void punctul4(Scanner scan) {
        //Write a Java program to insert an element (specific position) into an array
        System.out.println("Dati dimensiune: ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        System.out.println("Dimensiunea initiala este:" + array.length);
        printArray(array);
        System.out.println("Dati indexul elementului:");
        int index = scan.nextInt();
        System.out.println("Dati valoarea: ");
        int value = scan.nextInt();
        array = addPosition(array, index, value);
        System.out.println("Dimensiunea finala:" + array.length);
        System.out.println();
        printArray(array);
    }

    public static void Punctul5(Scanner scan) {
        // Write a Java program to find the second largest element in an array.
        System.out.println("Dati dimensiune: ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        System.out.println("Al doilea maxim din array: ");
        System.out.println(largestNumber(extractElement(array, largestNumber(array))));
        // extrage cel mai mare el. din array...
    }

    public static void Punctul6(Scanner scan) {
        //Write a Java program to find the number of even and odd integers in a given array of integers
        System.out.println("Dati dimensiune: ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        System.out.println("Numere pare: " + countEven(array));
        System.out.println("Numere impare: " + countOdd(array));

    }

    public static int[] readArray(Scanner scan, int size) {
        System.out.print(" Dimensiune array");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("array [" + (i + 1) + "]=");
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static int sumaArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] extractpossition(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            {
                if (i == index) {
                    continue;
                } else {
                    newArray[count] = array[i];
                    count++;
                }
            }
        }
        return newArray;
    }

    public static int[] addPosition(int[] array, int index, int value) {
        int[] newArray = new int[array.length + 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                newArray[k] = value; // la pozitia k se insereaza noua valoare
                k++; // incrementarea pozitiilor
            }
            newArray[k] = array[i];// dupa inserarea elementului noul array
            k++; //incrementarea noiilor pozitii dupa inserare deoarece sirul se muta cu o poz.
        }
        return newArray;
    }

    public static int largestNumber(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) { //comparam elementele din array
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int[] extractElement(int[] array, int value) {
        int[] newArray = new int[array.length - 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            {
                if (array[i] == value) {
                    continue;
                } else {
                    newArray[count] = array[i];
                    count++;
                }
            }
        }
        return newArray;

    }


    public static int countEven(int[] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    public static int countOdd(int[] array) {
        return array.length - countEven(array);

    }


}