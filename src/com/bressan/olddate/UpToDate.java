package com.bressan.olddate;

import java.util.Date;

public class UpToDate {
    public static void main(String[] args) {
        // get the current date
        Date currentDate = new Date();
        System.out.println("Date formatted: " + currentDate);
        System.out.println("Date value in milliseconds: " + currentDate.getTime());

        // create a Date object with a specific value of time measured
        // in milliseconds from the epoch:
        Date date1 = new Date(1534813691881L);
        // change the date in the Date object:
        System.out.println("Date before adjustment: " + date1);
        date1.setTime(date1.getTime() + 1000000000L);
        System.out.println("Date after adjustment: " + date1);

        // compare two dates:
        String compareStatus = currentDate.after(date1) ? "after" : "before";
        System.out.println(currentDate + " is " + compareStatus + " " + date1);

        // set a date before epoch:
        date1.setTime(-1534813691881L);
        System.out.println("Date before epoch: " + date1);

    }

}
