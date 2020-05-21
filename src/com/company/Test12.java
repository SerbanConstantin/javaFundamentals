package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Test12 {

    public static void main(String[] args) {

        /*int v1 = 7;
        int v2 = 51;
        int vMax = v1 > v2 ? v1 : v2;//result = condition ? true-value:false-value;
        System.out.println(vMax);

        float students = 30;
        float rooms = 4;
        float studentsPerRoom = rooms == 0.0f ? 0.0f : students / rooms;
        System.out.println(studentsPerRoom);
        */

        //int iVal = 1;
//
//       while (iVal < 100){
//           System.out.println(iVal);
//           iVal *= 2;
//
//       }
//        for (int iVal = 0; iVal <= 100; iVal += 5){
//            System.out.println(iVal);
//         }

//        int[] theVals = {10, 20, 30};//new int[3];// sau = { 10, 20, 15}
//        theVals[0] = 10;
//        theVals[1] = 20;
//        theVals[2] = 15;
//
//        int sum = 0;
//
//        for (int i = 0; i < theVals.length; i++) {
//            sum += theVals[i];
//            System.out.println(sum);
//
//        }
//        System.out.println();
//        System.out.println(sum);
//
//        String[] stringArray = {"Honda", "Mazda", "Nissan", "Toyota"};
//
//        System.out.println(stringArray.length);
//        System.out.println(stringArray[0] + " " + stringArray[1] + " " + stringArray[2]);

//        int[] theVals = {10, 20, 15};
//        int sum = 0;
//        for (int currentVal : theVals){
//            sum += currentVal;
//            System.out.println(sum);
//
//        }
//        System.out.println(sum);

//        int iVal = 10;
//        switch (iVal % 2) {
//            case 0:
//                System.out.print(iVal);
//                System.out.println(" is even");
//                break;
//            case 1:
//                System.out.print(iVal);
//                System.out.println(" is odd");
//                break;
//            default:
//                System.out.println("oops it broke");
//                break;
//        }
//        int[] leftVals = {100, 25, 225, 11};
//        int[] rightVals = {50, 92, 17, 3};
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        int[] results = new int[opCodes.length];
//
//
//        for (int i = 0; i < opCodes.length; i++) {
//            switch (opCodes[i]) {
//                case 'a':
//                    results[i] = leftVals[i] + rightVals[i];
//                    break;
//                case 's':
//                    results[i] = leftVals[i] - rightVals[i];
//                    break;
//                case 'd':
//                    results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0;
//                    break;
//                case 'm':
//                    results[i] = leftVals[i] * rightVals[i];
//                    break;
//                default:
//                    System.out.println("Error - invalid opCode");
//                    results[i] = 0;
//                    break;
//            }
//        }
//        for (int theResult : results) {
//            System.out.print("result = ");
//            System.out.println(theResult);

//        int[] arrayOfInts = {1,2,3,4,5,6,7,8,9};
//
//        for (int i: arrayOfInts) {
//            System.out.print(i + " ");
//        }


//        Scanner in = new Scanner(System.in);
//        System.out.println("1: ");
//        int nr1 = in.nextInt();
//        System.out.println("2: ");
//        int nr2 = in.nextInt();
//        System.out.println("3: ");
//        int nr3 = in.nextInt();
//        System.out.println("4: ");
//       int nr4 = in.nextInt();
//        int sum = 0;
//
//
//        int[] arrayOfInts = {nr1, nr2, nr3, nr4};
//
//        for (int j : arrayOfInts) {
//            System.out.print(j + " ");
//            sum+= j;
//
//
//        }
//        System.out.println();
//        System.out.println(sum);

            //Java program to find the maximum and minimum value of an array:
//        int[] array = {1, 7, 3, 10, 9};
//
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//
//        System.out.println("Minimal value: " + min);
//
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//
//        System.out.println("Maximal value: " + max);


            //Java program to reverse an array of integer values
//        int[] array = {1, 7, 3, 10, 9};
//
//        int[] newArray = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            newArray[i] = array[array.length - 1 - i];
//        }
//        System.out.println(Arrays.toString(newArray));

            //Java program to sum values of an array and the nr of elements
//        int[] arrayOfInts = { 1,2,3,4,5,6,7,8,9};
//        System.out.println(Arrays.toString(arrayOfInts));
//        int sum = 0;

//        for (int j : arrayOfInts) {
//            sum +=j;
//
//        }
//        System.out.println(sum);
//        System.out.println(arrayOfInts.length);

//       String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
////////        for (int i = 0; i < cars.length; i++) {
////////            System.out.print(cars[i] + " ");
////////        }
//        for (String i : cars) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(cars));


        }


    }







