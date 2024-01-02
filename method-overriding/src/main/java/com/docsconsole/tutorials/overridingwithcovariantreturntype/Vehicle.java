package com.docsconsole.tutorials.overridingwithcovariantreturntype;

public class Vehicle {

    public Number run() {
        System.out.println("Vehicle is running");
        return Integer.valueOf(1);
    }

}