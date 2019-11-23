package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateAndTime1 {

    public static void main(String[] args) {
        LocalDate astazi = LocalDate.now();
        DayOfWeek dayOfWeek = astazi.getDayOfWeek();
        System.out.println(dayOfWeek);



    }
}
