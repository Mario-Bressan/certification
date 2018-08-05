package com.bressan.inheritance.polymorphism.p2;

interface MobileAppExpert {
    void deliverMobileApp();
}

class Employee {}

class Programmer extends Employee implements MobileAppExpert {
    @Override
    public void deliverMobileApp() {
        System.out.println("testing complete on real device");
    }
}

class Manager extends Employee implements MobileAppExpert {
    @Override
    public void deliverMobileApp() {
        System.out.println("QA complete");
        System.out.println("code delivered with release notes");
    }
}

public class PolymorphismWithInterfaces {
    public static void main(String[] args) {
        MobileAppExpert expert1 = new Programmer();
        MobileAppExpert expert2 = new Manager();
        expert1.deliverMobileApp();
        expert2.deliverMobileApp();
    }
}
