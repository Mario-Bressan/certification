package com.bressan.olddate;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class UsingDateFormat {
    public static void main(String[] args) {

        // create Brazil locale
        Locale BRAZIL = new Locale("pt","BR");
        // create some date/time formatters
        DateFormat[] dateTimeFormatters = new DateFormat[]{
                DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, BRAZIL),
                DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, BRAZIL),
                DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, BRAZIL),
                DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, BRAZIL)
        };

        // style names
        String[] styles = {"FULL", "LONG", "MEDIUM", "SHORT"};

        // format current date/time using different date formatters
        Date date = new Date();
        int i = 0;
        for(DateFormat dtf : dateTimeFormatters)
            System.out.printf("%-6s: %s%n", styles[i++], dtf.format(date));

    }
}
