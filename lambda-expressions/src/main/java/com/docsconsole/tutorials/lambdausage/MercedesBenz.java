package com.docsconsole.tutorials.lambdausage;

public class MercedesBenz {
    public void displayAudiFeatures() {
        Vehicle vehicle = () -> {
            return "MercedesBenz.";
        };
        String brand = vehicle.getVehicleBrand();
        System.out.println(brand);
    }
}