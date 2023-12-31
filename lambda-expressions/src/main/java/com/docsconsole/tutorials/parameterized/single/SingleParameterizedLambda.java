package com.docsconsole.tutorials.parameterized.single;

public class SingleParameterizedLambda {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = (brand) -> {
            System.out.println(" The Vehicle brand is " + brand + ".");
        };
        vehicle2.displayVehicleName("Audi");
    }
}
