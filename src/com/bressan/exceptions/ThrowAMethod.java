package com.bressan.exceptions;

public class ThrowAMethod {
    public static void main(String[] args) {
        try {
            throw method();
        } catch (Exception e) {
            System.out.println("caught");
        }
    }

    static Exception method() {
        return new Exception();
    }
}
