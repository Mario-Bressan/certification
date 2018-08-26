package com.bressan.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UsingAtTime {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2018, 8, 26);

        LocalDateTime dt = d.atTime(LocalTime.NOON);

        System.out.println(dt);
    }
}
