package com.docsconsole.tutorials.overridingwithsignature;

public class MainClient {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.run(Double.valueOf("1"));
    }
}
