package com.bressan.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class UsingPeriod {
    public static void main(String[] args) {

        Period p = Period.ofMonths(13);
        // Returns a copy of this period with the years and months normalized.
        System.out.println(p.normalized()); // prints P1Y1M

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1982, Month.JANUARY, 1);

        LocalDate nextBDay = birthday.withYear(today.getYear());

        //If your birthday has occurred this year already, add 1 to the year.
        if(nextBDay.isBefore(today) || nextBDay.isEqual(today))
            nextBDay = nextBDay.plusYears(1);

        Period p1 = Period.between(today, nextBDay);
        long p2 = ChronoUnit.DAYS.between(today, nextBDay);
        System.out.println("There are " + p1.getMonths() + " months, and " +
                p1.getDays() + " days until your next birthday. (" +
                p2 + " total)");



    }
}
