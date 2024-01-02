package com.docsconsole.tutorials.overridingwithsignature;


public class Car extends Vehicle {

    public void run(double d) {
        System.out.println("Car is running with " + d);
    }
}