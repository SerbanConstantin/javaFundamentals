package com.company;

import java.time.LocalDate;
import java.time.Year;

public class DateAndTime5 {
    //write a java program to get the months remaining in the year
    public static void main(String[] args) {

        LocalDate azi = LocalDate.now();
        int totalLuni = 12;
        int luniRamase = totalLuni - azi.getMonthValue();

        System.out.println(luniRamase);






    }
}
