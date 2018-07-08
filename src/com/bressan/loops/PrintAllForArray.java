package com.bressan.loops;

public class PrintAllForArray {
    public static void main(String[] args) {
        int ar[][] = {{1,11}, {1}, {1,11}};

        for(int x = 0; x < ar.length; x++) {
            for(int y : ar[x])
                System.out.println(y);
        }
    }
}
