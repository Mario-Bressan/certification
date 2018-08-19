package com.bressan.exceptions;

public class UsingExceptions {

    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception exception) { // catch exception thrown in method1
            System.err.println(exception.getMessage());
            exception.printStackTrace();

            // obtain the stack trace information
            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.println("Stack trace from getStackTrace");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            // loop through traceElements to get exception description
            for(StackTraceElement element : traceElements) {
                System.out.print(element.getClassName() + " ");
                System.out.print(element.getFileName() + " ");
                System.out.print(element.getLineNumber() + " ");
                System.out.println(element.getMethodName());
            }
        }

    }

    public static void method1() throws Exception {
        method2();
    }
    public static void method2() throws Exception {
        method3();
    }
    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }
}
