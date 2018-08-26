package com.bressan.selectedclasses.stringbuilder;

//The append method accepts any data types.
public class AppendStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append(true); // appends boolean
        sb.append(10);      // appends int
        sb.append('a');     // appends char
        sb.append(20.99);   // appends double
        sb.append("Hi");    // appendsString
        System.out.println(sb);
        // Prints true10a20.99Hi
    }
}
