package com.bressan.encapsulation.second.p2;

import com.bressan.encapsulation.second.p1.A;

public class B extends A {

    int x = j;

    public static void main(String [] args) {

        A a = new A();
        a.change();
        System.out.println(a.j); // does not compile why j is not static in A

    }
}
