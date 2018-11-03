package com.bressan.inheritance.interfaces;

interface I {
    public default void print() {
        System.out.println("default method");
    }

    static void method() {
        System.out.println("static method");
    }
}

public class TestNewInterface {
    public static void main(String[] args) {
        // initializing a instance of type I
        I i = new I() {};
        // default method must be called from object
        i.print();
        // static method can be called from object or interface/class reference
        I.method();

    }
}
