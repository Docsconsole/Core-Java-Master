package com.docsconsole.tutorials;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        Arrays.asList(1, 2, 3, 7, 8, 9, 10, 12)
                .stream().filter(e -> {return e%2 != 0; })
                .forEach(System.out::println);
    }
}
