package ro.sdaacademy.javafundamentals.ArrayExercise;

import varargs.VarArgsUtils;

import java.util.Scanner;

public class arrayExercise {
    /**
     * read from keyboard the array dimensions m and n
     * <p>
     * create and int array of dimensions [m,n]
     * <p>
     * read from keyboard all values in the array
     * <p>
     * calculate
     * 1. min value
     * 2. max value
     * 3. sum of all values using VarArgsUrtils.getSum method
     * 4. calculate average value
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("m=");
        int m = Integer.parseInt(in.nextLine());
        System.out.print("n=");
        int n = Integer.parseInt(in.nextLine());

        System.out.println("Creating array of dimensions (" + m + "," + n + ")");
        int[][] array = new int[m][n];

        System.out.println("Please input values");

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("array[" + i + "," + j + "]=");
                array[i][j] = Integer.parseInt(in.nextLine());
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            sum += VarArgsUtils.getSum(array[i]);
        }

                        System.out.println("MIN = " + min);
                        System.out.println("MAX = " + max);
                        System.out.println("SUM = " + sum);
                        System.out.println("AVG = " + sum / (m * n));

                    }

                }




























