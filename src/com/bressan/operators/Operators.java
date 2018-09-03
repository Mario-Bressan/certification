package com.bressan.operators;

public class Operators {
    static int x;
    public static void main(String[] args) {
        // The bitwise XOR
        System.out.println("1^0: " + (true^false));
        System.out.println("0^0: " + (false^false));
        System.out.println("1^1: " + (true^true));
//        prints:
//        1^0: true
//        0^0: false
//        1^1: false

//        The bitwise operator is useful when the program
//        depends on the execution of the second method.
        if (evaluateThis() & evaluateThat()) {
            System.out.println("The result is true");
            System.out.println("x: " + x);
        } else {
            System.out.println("The result is false");
            System.out.println("x: " + x);
        }
//        evaluateThis executed
//        evaluateThat executed
//        The result is false
//        x: 2
    }

    private static boolean evaluateThis() {
        System.out.println("evaluateThis executed");
        x = 1;
        return true;
    }

    private static boolean evaluateThat() {
        System.out.println("evaluateThat executed");
        x = 2;
        return false;
    }
}

