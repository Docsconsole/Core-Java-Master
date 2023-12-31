package com.docsconsole.tutorials.parameterized.zero;

public class ZeroParameterizedLambda {
    public static void main(String[] args) {
        Vehicle1 vehicle1 = () -> {
            System.out.println(" The Vehicle brand is Audi.");
        };
        vehicle1.displayVehicleName();
    }
}
