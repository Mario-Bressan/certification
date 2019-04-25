package com.bressan.testes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        String data = "[aquivai]";
        String regex = "(\\[(\\w+)\\])+";
        System.out.print(extract(data, regex));
    }

    public static String extract(String str, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        if (m.find())
            return m.group(2);
        return null;
    }
}
