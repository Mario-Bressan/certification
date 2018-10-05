package com.bressan.time;

import java.time.*;

public class PeriodAndDuration {
    public static void main(String[] args) {

        // Daylight Saving Time ends
        LocalDateTime ld = LocalDateTime.of(2018, Month.FEBRUARY, 17, 10, 0);

        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("America/Sao_Paulo"));
        // adding 24 hours
        date = date.plus(Duration.ofDays(1));
        System.out.println(date);

        date = ZonedDateTime.of(ld, ZoneId.of("America/Sao_Paulo"));
        // adding 1 day
        date = date.plus(Period.ofDays(1));
        System.out.println(date);
        // prints
        // 2018-02-18T09:00-03:00[America/Sao_Paulo]
        // 2018-02-18T10:00-03:00[America/Sao_Paulo]
    }
}

// The Duration will add an exact number of seconds, thus the duration of one day is always exactly 24 hours.
// By contrast, a Period will add to the conceptual day, trying to maintain the local time.
// Period does not mess with the time component of the date
// while Duration may change the time component if the date is close to the DST boundary.