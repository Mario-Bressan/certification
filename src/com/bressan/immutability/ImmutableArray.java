package com.bressan.immutability;

public class ImmutableArray {
    private int arr[];

    public ImmutableArray(int[] arr) {
        this.arr = arr;
    }
//    if we do not return a copy,
//    the variable that receives this will point to the same variable in memory
//    being able to modify it
    public int[] getArr() {
        return arr.clone();
    }
}
