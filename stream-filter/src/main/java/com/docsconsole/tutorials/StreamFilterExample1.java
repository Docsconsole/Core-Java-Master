package com.docsconsole.tutorials;

import java.util.Arrays;

public class StreamFilterExample1 {
    public static void main(String[] args) {
        Arrays.asList(100, 40, 150, 30, 200, 20, 250, 10)
                .stream().filter(e -> e < 100) //filter if value is less than 100
                .map(e -> e * 2 ) // doubling the value
                .forEach(System.out::println);
    }
}
