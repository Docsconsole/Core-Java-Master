package com.docsconsole.tutorials;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToListExample {

    public static void main(String[] args) {

        // Using for loop
        System.out.println("Using for loop");
        String[] fruitsArray = new String[5];
        fruitsArray[0] ="Apple";
        fruitsArray[1] ="Orange";
        fruitsArray[2] ="Banana";
        fruitsArray[3] ="Pomegranate";
        List<String> fruitsList = new ArrayList<>();
        for ( int i =0; i < fruitsArray.length; i++ ) {
            fruitsList.add(fruitsArray[i]);
        }
        fruitsList.forEach(System.out::println);

        // Using asList() method form ArrayList
        System.out.println("Using asList() method form ArrayList");
        List<String> fruitsList1 = Arrays.asList(fruitsArray);
        fruitsList1.forEach(System.out::println);

        // Using addAll() method form Collections
        System.out.println("Using addAll() method form Collections");
        List<String> fruitsList2 = new ArrayList<>();
        Collections.addAll(fruitsList2, fruitsArray);
        fruitsList2.forEach(System.out::println);

        //Using Streams
        System.out.println("Using streams");
        List<String> fruitsList3 = Arrays.stream(fruitsArray).collect(Collectors.toList());
        fruitsList3.forEach(System.out::println);

        //Using Guava library
        System.out.println("Using Guava Lists.newArrayList() ");
        List<String> fruitsList4 =Lists.newArrayList(fruitsArray);
        fruitsList4.forEach(System.out::println);
    }


}

