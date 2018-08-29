package com.bressan.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveIf {
    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(3);
        ints.add(4);
        ints.add(2,3);

        ints.removeIf(e -> e < 3);

        System.out.println(ints);
    }
}
