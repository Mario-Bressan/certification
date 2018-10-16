package com.bressan.operatorsnstatetements;

public class SwitchExample {
    public static void main(String[] args) {

        int dayOfWeek = 1;
        final char a = 'A', d = 'D';
        char grade = 'B';

        switch (dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday ");
            case 3:
                System.out.println("Wednesday ");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
        }
        // prints:
        // Monday
        // Tuesday
        // Wednesday
        // Thursday
        // Friday
        // Saturday
    }
}
