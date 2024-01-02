package com.docsconsole.tutorials.overridingcheckedexceptions;


public class Bus extends Vehicle {
    public void run() throws NullPointerException {
        System.out.println("Bus is running");
    }
}