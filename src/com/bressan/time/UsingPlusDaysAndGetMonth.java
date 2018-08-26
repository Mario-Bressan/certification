package com.bressan.time;

import java.time.LocalDate;

public class UsingPlusDaysAndGetMonth {
    public static void main(String[] args) {
        LocalDate Id = LocalDate.of(2018, 8, 26).plusDays(3);
        System.out.println(Id.getMonth()); // prints AUGUST
        System.out.println(Id.getMonthValue()); // prints 8
    }
}
