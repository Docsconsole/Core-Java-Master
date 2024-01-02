package com.docsconsole.tutorials.single;

public class MainClient {
    public static void main(String[] args) {

        BlueBerry fruit = new BlueBerry();
        fruit.eat();
        System.out.println("Inherited Field: " + fruit.name);
        fruit.getBlueBerryTaste();
    }
}
