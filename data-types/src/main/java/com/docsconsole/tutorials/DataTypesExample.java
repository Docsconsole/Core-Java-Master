package com.docsconsole.tutorials;


import java.io.IOException;

public class DataTypesExample {
    public static void main(String[] args) throws IOException {

        boolean isJavaRobust = true;
        char ch1 = 's';
        char ch2 = '\uffff';
        byte b1 = 65;
        byte b2 = -65;
        short s1 = 100;
        short s2 = -100;
        int i1 =  100000;
        int i2 =  -100000;
        long l1 =  4350000000000l;
        long l2 =  -4350000000000l;
        float f = 10.5f;
        double d = 10.5;

        System.out.println("The char variable " + ch1);
        System.out.println("The char variable " + ch2);
        System.out.println("The byte variable is " + b1);
        System.out.println("The byte variable is " + b2);
        System.out.println("The short variable is " + s1);
        System.out.println("The short variable is " + s2);
        System.out.println("The integer variable is " + i1);
        System.out.println("The integer variable is " + i2);
        System.out.println("The long variable is " + l1);
        System.out.println("The long variable is " + l2);
        System.out.println("The float variable is " + f);
        System.out.println("The double variable is " + d);


        String str = "This is string.";
        String subStr = str.substring(0,4);
        System.out.println(subStr);


        int inArray[] = new int[10];
        char charArray[] = new char[20];
        float floatArray[] = new float[30];

        System.out.println(inArray.length);
        System.out.println(charArray.length);
        System.out.println(floatArray.length);
    }


}