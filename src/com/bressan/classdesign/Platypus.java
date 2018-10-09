package com.bressan.classdesign;


class Mammal {
    public Mammal() {
        System.out.println("Mammal");
    }

    public Mammal(int age) {
        System.out.println("Mammal age");
    }
}

public class Platypus extends Mammal{
    public Platypus() {
        System.out.println("Platypus");
    }

    public Platypus (int age) {
        System.out.println("age");
    }

    public static void main(String[] args) {
        new Mammal();
        new Mammal(5);
        new Platypus();
        // prints:
        // Mammal
        // Mammal age
        // Mammal
        // Platypus
    }
}

// If the subclass defines a constructor with no arguments, then the superclass also needs to define one in addition to its constructor with arguments.
// Otherwise, the subclass constructor should be an explicit call to super(int age).