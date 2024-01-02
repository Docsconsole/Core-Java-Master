package com.docsconsole.tutorials;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample1 {
    public void getFileContent() throws FileNotFoundException {
        String fileName = "wrong file name";
        File file = new File(fileName);
        FileInputStream stream = new FileInputStream(file);

    }

    public static void main(String[] args) throws FileNotFoundException {
        new CheckedExceptionExample1().getFileContent();
    }
}