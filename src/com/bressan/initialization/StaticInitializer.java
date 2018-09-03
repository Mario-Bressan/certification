package com.bressan.initialization;

public class StaticInitializer {
//     This type of block is executed
//    before the constructor is executed.
//    Initialization blocks are useful when more complex initialization sequences are
//    needed which cannot be supported with the simpler instance variable initializers.
//    This initialization can also be performed in a constructor.
    static {
        x = 10;
        y = 5;
    }
    final static int x;
    final static int y;

    public static void main (String args[]) {
        try {
            StaticInitializer si = new StaticInitializer();
            int c = si.x/y;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
    }
}
