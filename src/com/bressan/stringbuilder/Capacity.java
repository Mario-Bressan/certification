package com.bressan.stringbuilder;

public class Capacity {
    public static void main(String[] args) {

        // Creates an array of length str.length
        StringBuilder sb = new StringBuilder("Bressan");
//        public StringBuilder(String str) {
//            value = new char[str.length() + 16];
//            append(str);
//        }
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        // returns void
        sb.trimToSize();

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        // Creates an array of length 16
        StringBuilder sb2 = new StringBuilder();
//        StringBuilder() {
//            value = new char[16];
//        }
        System.out.println(sb2.capacity());
    }
}
