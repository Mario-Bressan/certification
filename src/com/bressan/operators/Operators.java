package com.bressan.operators;

public class Operators {
    public static void main(String[] args) {
        // The bitwise XOR
        System.out.println("1^0: " + (true^false));
        System.out.println("0^0: " + (false^false));
        System.out.println("1^1: " + (true^true));

//        The bitwise operator is useful when the program
//        depends on the execution of the second method.
        if (evaluateThis() & evaluateThat()) {
            System.out.println("The result is true");
        } else {
            System.out.println("The result is false");
        }
    }

    private static boolean evaluateThis() {
        System.out.println("evaluateThis executed");
        return true;
    }

    private static boolean evaluateThat() {
        System.out.println("evaluateThat executed");
        return false;
    }
}

