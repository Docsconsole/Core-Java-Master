package com.docsconsole.tutorials.overridingwithstatic;

public class MainClient {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        Vehicle.run();
    }
}
