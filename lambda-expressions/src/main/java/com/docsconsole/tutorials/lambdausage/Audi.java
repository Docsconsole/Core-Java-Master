package com.docsconsole.tutorials.lambdausage;

public class Audi {
    public void displayAudiFeatures() {
        Vehicle vehicle = () -> {
            return "Audi.";
        };
        String brand = vehicle.getVehicleBrand();
        System.out.println(brand);
    }

}