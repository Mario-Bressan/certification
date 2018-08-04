package com.bressan.inheritance.polymorphism;

abstract class Employee {
    public void reachOffice() {
        System.out.println("reached office - Porto Alegre, Brasil");
    }
    //Doesn’t know how to work on a project
    public abstract void startProjectWork();
}

class Programmer extends Employee {
    public void startProjectWork() {
        defineClasses();
        unitTestCode();
    }
    private void defineClasses() {
        System.out.println("define classes");
    }
    private void unitTestCode() {
        System.out.println("unit test code");
    }
}

class Manager extends Employee {
    public void startProjectWork() {
        meetingWithCustomer();
        defineProjectSchedule();
        assignRespToTeam();
    }

    private void meetingWithCustomer() {
        System.out.println("meet Customer");
    }
    private void defineProjectSchedule() {
        System.out.println("Project Schedule");
    }
    private void assignRespToTeam() {
        System.out.println("team work starts");
    }
}

public class PolymorphismWithClasses {
    public static void main(String[] args) {
        Employee emp1 = new Programmer();
        Employee emp2 = new Manager();
        emp1.reachOffice();
        emp2.reachOffice();
        emp1.startProjectWork();
        emp2.startProjectWork();
    }
}
