package com.company;

import java.time.LocalDate;
import java.time.Month;

public class DateAndTime2 {
    //write a java program to get the number of days of the current month
    public static void main(String[] args) {
        LocalDate astazi = LocalDate.now();
        Month lunaCorespunzatoareZileiDeAzi = astazi.getMonth();
        int numarulDeZile = lunaCorespunzatoareZileiDeAzi.maxLength();

        System.out.println(numarulDeZile);




    }
}
