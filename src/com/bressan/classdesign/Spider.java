package com.bressan.classdesign;

class Arthropod {

    public void printName(double input) {
        System.out.println("Arthropod");
    }
}

public class Spider extends Arthropod {

    public void printName(int input) {
        System.out.println("Spider");
    }

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.printName(4);
        spider.printName(9.0);
        // the method is an overload, so both methods may be called
        // prints:
        // Spider
        // Arthropod

    }
}
