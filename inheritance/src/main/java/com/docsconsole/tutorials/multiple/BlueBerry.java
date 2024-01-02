package com.docsconsole.tutorials.multiple;

public class BlueBerry implements Fruit, Berry {

    public void getBlueBerryTaste() {
        System.out.println("BlueBerry's taste is sweet.");
    }

    @Override
    public void getFruitCategory() {
        System.out.println("The fruit category is Berry");
    }

    @Override
    public void eat() {
        System.out.println("Fruit is an eatable item.");
    }
}
