package com.docsconsole.tutorials.overridingwithstrictfp;

public class Vehicle {

    public strictfp void run() {
        System.out.println("Vehicle is running");
    }

    public void run(String fuel) {
        System.out.println("Vehicle is running with: "+ fuel);
    }

}