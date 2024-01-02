package com.docsconsole.tutorials.overridingwithsynchornized;


public class Car extends Vehicle {

    public void run() {
        System.out.println("Car is running");
    }

    public synchronized void run(String fuel) {
        System.out.println("Car is running with: " +fuel);
    }

}