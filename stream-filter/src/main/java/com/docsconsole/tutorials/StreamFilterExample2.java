package com.docsconsole.tutorials;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamFilterExample2 {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(100, 40, 150, 30, 200, 20, 250, 10);
        Predicate predicate = (Predicate<Integer>) n -> {
            if (n < 100) {
                return true;
            }
            return false;
        };
        numList.stream().filter(predicate) //filter if value is less than 100
        .forEach(System.out::println);
    }
}