package com.bressan.loops;

public class WhileDoWhile {
    public static void main(String[] args) {
        int x = 10;
        while (x>0) {
            do {
                x -= 2;
            } while (x > 3);
            x--;
            System.out.print(x); // 1 -2
        }
    }
}
