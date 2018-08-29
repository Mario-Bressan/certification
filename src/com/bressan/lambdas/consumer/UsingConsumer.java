package com.bressan.lambdas.consumer;

import java.util.function.Consumer;

public class UsingConsumer {
    public static void main(String[] args) {

        Consumer<String> c = (x) -> System.out.println(x.toUpperCase());
        c.accept("Mario Bressan");
    }
}
