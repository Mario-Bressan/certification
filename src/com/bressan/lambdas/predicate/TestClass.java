package com.bressan.lambdas.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// boolean test(T t) is the only method of Predicate interface. This method is abstract.
//So all we need for our body part in the lambda expression
//is an expression that returns a boolean.
public class TestClass {
    public static void main(String[] args) {
        boolean b = checkList(new ArrayList(), al -> al.isEmpty());
        boolean b2 = checkList(new ArrayList(), al -> al.add("hello"));
        System.out.println(b + " " + b2);

    }

    public static boolean checkList(List list, Predicate<List> p) {
        return p.test(list);
    }
}
