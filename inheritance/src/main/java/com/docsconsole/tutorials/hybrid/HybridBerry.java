package com.docsconsole.tutorials.hybrid;

public class HybridBerry implements BlackBerry, BlueBerry {

    @Override
    public void getFruitCategory() {
        System.out.println("The fruit category is Berry");
    }

    @Override
    public void getBlueBerryTaste() {
        System.out.println("BlueBerry's taste is sweet.");
    }

    @Override
    public void getBlackBerryTaste() {
        System.out.println("BlackBerry's taste is sweet.");
    }

}
