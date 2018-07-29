package com.bressan.inheritance;

import java.time.LocalDateTime;

interface Interviewer {
    abstract void conductInterview();
    default void submitInterviewStatus() {
        System.out.println("Accept");
    }
    static void bookConferenceRoom(LocalDateTime dateTime, int duration) {
        System.out.println("Interview scheduled on: " + dateTime);
        System.out.println("Book conference room for: " + duration + " hrs");
    }
}

class Manager implements Interviewer {

    @Override
    public void conductInterview() {
        System.out.println("Interview being conducted by the manager");
    }
}

public class Project {
    public static void main(String[] args) {
        Interviewer inv = new Manager();

/*        A method in an interface can’t be called using a reference
        static variable. It must be called using the interface name.*/
        Interviewer.bookConferenceRoom(LocalDateTime.now(), 2);
        inv.conductInterview(); // implemented abstract method in the class
        inv.submitInterviewStatus(); // method using the default implementation of the interface
    }
}
