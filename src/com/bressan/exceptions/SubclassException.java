package com.bressan.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubclassException {
    public static void main(String[] args) {
        try {
            method();
        } catch (FileNotFoundException fne) { //we should try to catch the subclass before
            System.out.println("fne");
        } catch (IOException ioe) { // required because method throws IOException
            System.out.println("ioe");
        }
    }

    static void method() throws IOException {
        throw new FileNotFoundException();
    }
}
