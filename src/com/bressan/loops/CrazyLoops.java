package com.bressan.loops;

public class CrazyLoops {
    public static void main(String[] args) {
        crazyLoop();
        crazyLoop2();
        crazyLoop3();
    }

    // A labelled break breaks out of the loop that is marked with the given label.
    // simple example
    static void crazyLoop() {
        int c = 0;
        JACK: while (c < 8) {
            JILL: System.out.println(c);
            if (c > 3) break JACK;
            else c++;
        }
    }

    static void crazyLoop2() {
        int c = 0;
        JACK: while (c < 8) {
            JILL: System.out.println("c = " + c);
            for (int k = 0; k < c; k++) {
                System.out.println(" k = " + k + " c = " + c);
                if (c > 3) break JACK; // break JACK; will break out from the outer most loop
            }
            c++;
        }
    }

    static void crazyLoop3() {
        int c = 0;
        JACK: while (c < 8) {
            JILL: System.out.println("c = " + c);
            for (int k = 0; k < c; k++) {
                System.out.println(" k = " + k + " c = " + c);
                if (c > 3) break; // a break without a label only breaks out of the current loop.
            }
            c++;
        }
    }
}
