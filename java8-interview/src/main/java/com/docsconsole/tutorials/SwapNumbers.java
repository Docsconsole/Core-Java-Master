package com.docsconsole.tutorials;

public class SwapNumbers {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println("x: " + x + ", y: " + y);
    }
}
