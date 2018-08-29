package com.bressan.stringbuilder;

public class SBSumOfCapacities {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder(10); // capacity: 10
        StringBuilder sb2 = new StringBuilder("ABCD");     // capacity: 20

        System.out.println(sb1.capacity()+sb2.capacity()); // prints 30
    }
}
