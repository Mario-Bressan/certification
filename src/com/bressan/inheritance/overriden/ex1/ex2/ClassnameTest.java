package com.bressan.inheritance.overriden.ex1.ex2;

import java.util.ArrayList;
import java.util.List;

public class ClassnameTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("mrx");
        String s = sb.toString();
        list.add(s);
        System.out.println(s.getClass());
        System.out.println(list.getClass());
        // The getClass method always returns the Class object for the actual object on which the method is called
        // irrespective of the type of the reference
    }
}
