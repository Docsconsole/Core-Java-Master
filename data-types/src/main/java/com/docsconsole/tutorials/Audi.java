package com.docsconsole.tutorials;

public class Audi implements Vehicle {
    public String getEngineName() {
        return "Engine X555X";
    }
    public short getNoOfWheels() {

        return this.wheels;
    }
    public static void main(String[] args) {
        Audi audi = new Audi();
        System.out.println("Audi has engine" + audi.getEngineName() +"and with wheels: "+ audi.wheels);

    }
}
