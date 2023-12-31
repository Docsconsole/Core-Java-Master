package com.docsconsole.tutorials.parameterized.multi;

public class MultiParameterizedLambda {
    public static void main(String[] args) {
        Vehicle3 vehicle3 = (brand, fuelType) -> {
            System.out.println(" The Vehicle brand is " + brand +
                    " with Fuel type" + fuelType + ".");
        };
        vehicle3.displayVehicleName("Audi", "Diesel ");
    }
}
