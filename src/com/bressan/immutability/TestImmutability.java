package com.bressan.immutability;

public class TestImmutability {
    public static void main(String[] args) {
        int[] list = new int[3];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;

        ImmutableArray array = new ImmutableArray(list);

        int[] a = array.getArr();
        for(int i : a)
            System.out.println(i);
        a[1] = 5;
        int[] b = array.getArr();
        for(int i : b)
            System.out.println(i);

     }

}
