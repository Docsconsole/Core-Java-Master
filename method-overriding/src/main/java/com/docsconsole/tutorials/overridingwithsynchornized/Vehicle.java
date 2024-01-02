package com.docsconsole.tutorials.overridingwithsynchornized;

public class Vehicle {

    public synchronized void run() {
        System.out.println("Vehicle is running");
    }

    public void run(String fuel) {
        System.out.println("Car is running with: " +fuel);
    }

}