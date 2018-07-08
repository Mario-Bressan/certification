package com.bressan.loops;

public class Continue {
    public static void main(String[] args) {

        // The continue statement stops executing the next statements
        // and skips to the next iteration
        for (int x = 1; x < 10; x++) {
            if(x%2 == 1)
                continue; //
            System.out.print(x);
        }
    }
}
