package com.bressan.exceptions;

public class UsingPipeInCatchBlock {
    static Integer i;

    public static void main(String[] args) {

        try {
            //System.out.println(i.doubleValue());
            double result = 1/0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(e.getClass().getSimpleName());
        }

    }
}
