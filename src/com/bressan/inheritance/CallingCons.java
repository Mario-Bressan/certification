package com.bressan.inheritance;

// Create a super class.
class A {
    A() {
        System.out.println("Inside A's constructor.");
    }
}

// Create a subclass by extending class A.
class B extends A {
    B() {
        System.out.println("Inside B's constructor.");
    }
}

// Create another subclass by extending B.
class C extends B {
    C() {
        System.out.println("Inside C's constructor.");
    }
}

public class CallingCons {
    public static void main(String args[]) {
        C c = new C();
    }
}

//prints
//Inside A's constructor.
//Inside B's constructor.
//Inside C's constructor.

// The constructors are executed in order of derivation.
