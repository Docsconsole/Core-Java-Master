package com.docsconsole.tutorials.overridingwithstrictfp;

public class MainClient {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.run();
        Vehicle vehicle1 = new Car();
        vehicle1.run("petrol");
    }
}
