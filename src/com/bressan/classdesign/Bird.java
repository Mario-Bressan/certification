package com.bressan.classdesign;

public abstract class Bird {
    private void fly() {
        System.out.println("Bird is flying");
    }

    public static void main(String[] args) {
        Bird bird = new Pelican();
        bird.fly();
        // prints:
        // Bird is flying
    }
}

class Pelican extends Bird {
    protected void fly() {
        System.out.println("Pelican is flying");
    }
}


// The trick here is that the method fly() is marked as private in the parent class Bird,
// which means it may only be hidden, not overridden.
// With hidden methods, the specific method used depends on where it is referenced.
// Since it is referenced within the Bird class, the method declared on line 4 was used.