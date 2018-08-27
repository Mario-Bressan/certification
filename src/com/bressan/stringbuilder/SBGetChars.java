package com.bressan.stringbuilder;

public class SBGetChars {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Bressan");
        char[] ch = new char[6];
        sb.getChars(0,5, ch, 1);
        for (char c : ch)
            System.out.print(c);
    }
}
