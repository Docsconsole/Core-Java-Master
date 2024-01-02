package com.docsconsole.tutorials;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {
    public void getFileContent() {
        String fileName = "wrong file name";
        File file = new File(fileName);
        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CheckedExceptionExample().getFileContent();
    }
}