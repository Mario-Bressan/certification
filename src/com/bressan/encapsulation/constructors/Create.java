package com.bressan.encapsulation.constructors;

public class Create {

    Create() {
        System.out.println("no parameters");
    }

    Create(int num) {
        System.out.println("primitive int");
    }

    Create(Integer num) {
        System.out.println("Wrapper integer");
    }

    Create(Object num) {
        System.out.println("Object of type " + num.getClass().getSimpleName());
    }

    Create(int... nums) {
        System.out.println("varargs");
    }

    public static void main(String[] args) {
        // here Java searches for
        // the nearest int constructor
        new Create(100);
        // here Java uses autoboxing for create
        // an object of type Long
        new Create(100L);

        // prints
        // primitive int
        // Object of type Long
    }



}
