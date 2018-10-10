package com.bressan.inheritance.overriden.ex1;

// static methods are never overridden.
// They are hidden just like static or non-static fields.
class A {
    int i = 10;
    public static void m1() {
        System.out.println("m1 in parent");
    }
    public void m2() {
        System.out.println("m2 in parent");
    }
}

class B extends A {
    int i = 20;
    // hidden method
    public static void m1() {
        System.out.println("m1 in child");
    }
    // overriden method
    public void m2() {
        System.out.println("m2 in child");
    }

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.i);
        // as the reference is from the parent class, the called method is from the parent class.
        a.m1();
        a.m2();

        B b = new B();
        System.out.println(b.i);
        // as the reference is from the child class, the called method is from the child class.
        b.m1();
        b.m2();
    }
}
