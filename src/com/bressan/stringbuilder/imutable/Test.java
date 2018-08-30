package com.bressan.stringbuilder.imutable;

public class Test {
    public static void main(String[] args) {

        // All refer to the same StringBuilder object
        // if a copy is not returned
        StringBuilder sb = new StringBuilder("initial");
        ImmutableSwan problem = new ImmutableSwan(sb);
        sb.append(" added");
        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append(" more");

        System.out.println(problem.getBuilder());
        // fail print: initial added more
        // print with defensive copy: initial added




    }
}
