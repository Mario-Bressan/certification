package com.bressan.arrays;

import java.util.Arrays;

public class EqualsAndDeepEquals {
    public static void main(String[] args) {
        int[] arrA = {1, -2, 4};
        int[] arrB = {1, -2, 4};

        Integer[] arrC = {1, -2, 4};
        Integer[] arrD = {1, -2, 4};

        System.out.println(Arrays.equals(arrA, arrB) + " ");

        // System.out.println(Arrays.deepEquals(arrA, arrB) + " "); compilation fails

        System.out.println(Arrays.equals(arrC, arrD) + " ");
        // the deepEquals compares objects
        System.out.println(Arrays.deepEquals(arrC, arrD));
    }
}
