package com.docsconsole.tutorials.overridingwithstrictfp;


public class Car extends Vehicle {

    public void run() {
        System.out.println("Car is running");
    }
    public strictfp void run(String fuel) {
        System.out.println("Car is running with: "+ fuel);
    }

}