package com.bressan.olddate;

import java.util.Calendar;
import java.util.Date;

public class UsingCalendar {
    public static void main(String[] args) {
        // get a calendar with current time and print its date
        Calendar calendar = Calendar.getInstance();
        printDate("The date in the calendar: ", calendar);
        // convert to Date
        Date date1 = calendar.getTime();
        System.out.println("The date in the calendar: " + date1);
        // set calendar according to a Date
        Date date2 = new Date(1534815516083L);
        System.out.println("The date is " + date2);
        calendar.setTime(date2);
        printDate("The date in the calendar: ", calendar);
        // set values in a calendar
        calendar.set(Calendar.DAY_OF_MONTH, 33);
        calendar.set(calendar.MONTH, 13);
        calendar.set(calendar.YEAR, 2018);
        printDate("After setting: ", calendar);
        // adding to a calendar
        calendar.add(Calendar.MONTH, 12);
        printDate("After adding: ", calendar);
        // rolling a calendar
        calendar.roll(Calendar.MONTH, 12);
        printDate("After rolling: ", calendar);
        // first day of the week
        System.out.println((calendar.SUNDAY == calendar.getFirstDayOfWeek() ?
                "Sunday is" : "Sunday is not") +
                " the first day of the week");
    }

    static private void printDate(String prompt, Calendar calendar) {
        System.out.print(prompt);
        System.out.printf("%4d/%02d/%02d%n",
        calendar.get(Calendar.YEAR),
        (calendar.get(Calendar.MONTH) + 1), // adjust for month
        calendar.get(Calendar.DAY_OF_MONTH));
    }
}
