package com.bressan.initialization;

public class InitializationTest {

    public InitializationTest() {
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        System.out.println("main method");

        InitializationTest it = new InitializationTest();
    }

    static {
        System.out.println("static initializer");
    }
    {
        System.out.println("instance initializer");
    }
}
//prints:
//static initializer
//main method
//instance initializer
//constructor