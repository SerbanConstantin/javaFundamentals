package com.company;

public class Test13 {


    public void showSum(int x, int y, int count) {
        if (count<1)
            return;

        int sum = x + y;
        for (int i = 0; i < count; i++) {
            System.out.println(sum);
            return;
        }

        Test13 m = new Test13();
        m.showSum(7, 1, 3);
        System.out.println("BUHUHU");



    }




}
