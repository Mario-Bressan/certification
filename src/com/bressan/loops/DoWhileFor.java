package com.bressan.loops;

public class DoWhileFor {
    public static void main(String[] args) {
        int x = 0;
        do {
            System.out.print(x);
        } while (x++ < 2);      //validates the condition along with the post increment
        for (x = 0; x++ < 2;)
            System.out.print(x);
    }
}
