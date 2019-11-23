package com.company;

import java.util.Arrays;
import java.util.Random;

public class temainversare {
    public static class SortArray {
        public static void main(String[] args) {
            Random rnd = new Random();
            int[] array = new int[]{
                    rnd.nextInt(9),
                    rnd.nextInt(7),
                    rnd.nextInt(6),
                    rnd.nextInt(3),
                    rnd.nextInt(915)
            };
            System.out.println(Arrays.toString(array));
        }
    }
}
