package com.bressan.inheritance.instanceofpack;

class A {}
class B extends A {}
class C extends B {}
class D extends C {}

public class InstanceOf {
    public static void main(String[] args) {
        D d = new D();
        if (d instanceof A)
            System.out.println("d is a A");
    }
}
