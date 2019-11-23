package com.company;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class test7 {
    public static void main(String[] args) {
        Date now = new Date();

        System.out.println(now);

        long millis = System.currentTimeMillis();
        Date azi = new Date(millis);
        System.out.println(azi);

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime(); // convert Calendar to Date
        System.out.println(date);

        cal.setTime(now); // convert Date to Calendar
        System.out.println(cal.get(Calendar.YEAR)); // 2019
        System.out.println(cal.get(Calendar.DAY_OF_YEAR)); // 72
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));

        LocalDateTime acum = LocalDateTime.now();
        LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
        LocalDateTime.parse("2015-02-20T06:30:00");
        acum.plusDays(1);
        acum.minusHours(2);
        acum.getMonth();

        System.out.println(acum.plusDays(2));
        System.out.println(acum.plusHours(2));
        System.out.println(acum.plusMonths(1));




    }
}
