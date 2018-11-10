package com.bressan.arrays;

import java.util.Arrays;

import static java.lang.System.*;

public class ArraysSort {
    public static void main(String[] args) {
        String[] strings = {"N", "L", "n", "O", "S", "a"};
        Arrays.sort(strings);
        for (String s : strings)
            out.print(s);
        // prints
        // LNOSan
    }
}