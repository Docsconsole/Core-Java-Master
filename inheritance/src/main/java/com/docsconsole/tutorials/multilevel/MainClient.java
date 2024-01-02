package com.docsconsole.tutorials.multilevel;

import com.docsconsole.tutorials.hierarchy.Apple;

public class MainClient {
    public static void main(String[] args) {
        Apple fruit1 = new Apple();
        fruit1.eat();
        fruit1.getAppleTaste();

        BlueBerry fruit2 = new BlueBerry();
        fruit2.eat();
        fruit2.getBlueBerryTaste();
    }
}
