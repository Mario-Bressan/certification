package com.bressan.strings;

public class StringConstructors {

    public static void main(String[] args) {

        char[] charArray = {'b', 'o', 'm', ' ', 'd', 'i', 'a'};
        String s = new String("Ola");

        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray, 4, 3);

        System.out.printf(
                "s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%n", s1, s2, s3, s4
        );

        if(s1 == null)
            System.out.println("s1 is null");
        if(s1.isEmpty())
            System.out.println("s1 is empty");
        s1 = null;
        if(s1 == null)
            System.out.println("now s1 is null");

    }
}
