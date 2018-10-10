package com.bressan.inheritance.overriden.ex1.ex3;


class A {
    A() {
        print();
    }

    void print() {
        System.out.println("A");
    }
}
class B extends A {
    int i = 4;

    public static void main(String[] args) {
        // default B's constructor call to super()
        // A's constructor calls to print()
        // print is a non-private instance method and is therefore polymorphic, which means,
        // the selection of the method to be executed depends on the class of actual object on which it is invoked.
        // Since the class of actual object is B, B's print is selected
        // At this point of time, variable i has not been initialized, so its default value i.e. 0 is printed.
        A a = new B();
        // Finally, 4 is printed.
        a.print();
    }
    void print() {
        System.out.println(i);
    }

}
