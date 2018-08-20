package com.bressan.exceptions;

public class UsingChainedExceptions {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) { // exceptions thrown from method1
            e.printStackTrace();
        }

    }

    // call method2; throw exceptions back to main
    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) { // exception thrown from method2
            throw new Exception("Exception thrown in method1", e);
        }
    }

    public static void method2() throws Exception {
        try {
            method3();
        } catch (Exception e) { // exception thrown from method3
            throw new Exception("Exception thrown in method2", e);
        }
    }

    public static void method3() throws Exception {
        throw new Exception("Exceptioin thrown in method3");
    }
}
