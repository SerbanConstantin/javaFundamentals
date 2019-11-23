package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAndTime4 {
    //write a java program to get a date after 2 weeks and 10 minutes

    public static void main(String[] args) {

        LocalDateTime astaziAcum = LocalDateTime.now();
        LocalDateTime raspuns = astaziAcum.plusWeeks(2).plusMinutes(10);

        System.out.println(raspuns);








    }
}
