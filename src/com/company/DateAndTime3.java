package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DateAndTime3 {

    //write a java program to get the dates 10 days before and after today
    public static void main(String[] args) {

        LocalDate astazi = LocalDate.now();
        LocalDate acumZeceZile;
        LocalDate dupaZeceZile;

        acumZeceZile = astazi.minus(10, ChronoUnit.DAYS);
        dupaZeceZile = astazi.plus(10, ChronoUnit.DAYS);

        acumZeceZile = astazi.minusDays(10);
        dupaZeceZile = astazi.plusDays(10);


        System.out.println(astazi);
        System.out.println(acumZeceZile);
        System.out.println(dupaZeceZile);






    }
}
