package com.bressan.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Demonstrando lamdas e fluxos com um array de integers
public class ArraysAndStreams {

    public static void main(String[] args) {

        Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

        // exibe valores originais
        System.out.printf("Original values: %s%n", Arrays.asList(values));

        // classifica os valores em ordem creescente com fluxos
        System.out.printf("Sorted values: %s%n",
                Arrays.stream(values)
                        .sorted()
                        .collect(Collectors.toList()));

        // valores maiores que 4
        List<Integer> greaterThan4 =
                Arrays.stream(values)
                .filter(value -> value > 4)
                .collect(Collectors.toList());
        System.out.printf("Values greater than 4: %s%n", greaterThan4);

        // filtra valores maiores que 4 e entao classifica os resutados
        System.out.printf("Sorted values greater than 4: %s%n",
                Arrays.stream(values)
                        .filter(value -> value > 4)
                        .sorted()
                        .collect(Collectors.toList()));

        // lista greaterThan4 classificada com fluxos (streams)
        System.out.printf("Values greater than 4 (ascending with strems): %s%n",
                greaterThan4.stream()
                            .sorted()
                            .collect(Collectors.toList()));


    }


}
