package com.bressan.inheritance.interfaces;

public class AmbiguousReference implements T1, T2 {
    public static void main(String[] args) {
        AmbiguousReference ar = new AmbiguousReference();
        System.out.println(((T1)ar).VALUE);
        System.out.println(((T2)ar).VALUE);
        //explicit cast is necessary because there are two VALUE definitions
    }
    public void m1() {

    }
}

interface T1 {
    int VALUE = 1;
    void m1();
}

interface T2 {
    int VALUE = 2;
}
