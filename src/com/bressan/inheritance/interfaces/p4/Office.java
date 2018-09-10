package com.bressan.inheritance.interfaces.p4;

import java.time.LocalDateTime;

class Employee {
    String name;
    String address;
    String phoneNumber;
    String experience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}

interface Interviewer {
    // implicitly public and abstract
    void conductInterview();

//    the classes that implement this interface
//    may choose to override this method
//    if they do not override, the default implementation
//    of interface will be used
    default void submitInterviewStatus() {
        System.out.println("Accept");
    }

//    A static method in an interface can't be called using a reference variable.
//    It must be called using the interface name.
    static void bookConferenceRoom(LocalDateTime dateTime, int duration) {
        System.out.println("Interview scheduled on: " + dateTime);
        System.out.println("Book conference room for: " + duration + " hrs");
    }


}

class Manager extends Employee implements Interviewer {
    public void conductInterview() {
        System.out.println("Manager conducting interview");
    }
}

public class Office {
    public static void main(String[] args) {
        Interviewer manager = new Manager();
        ((Manager) manager).setName("Mario Bressan");
        ((Manager) manager).setPhoneNumber("999999999");

        System.out.println("Manager name: " + ((Manager) manager).getName());
        manager.conductInterview();
        Interviewer.bookConferenceRoom(LocalDateTime.now(), 2);
        manager.submitInterviewStatus();
    }
}
