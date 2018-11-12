package com.bressan.stringbuilder;

public class Comparing {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        StringBuilder sb0 = new StringBuilder("Java");
        String s = new String("Java");

        System.out.println(sb==sb0);
        System.out.println(s.endsWith(sb.toString()));
        System.out.println(sb.toString().endsWith(sb0.toString()));
    }

}
