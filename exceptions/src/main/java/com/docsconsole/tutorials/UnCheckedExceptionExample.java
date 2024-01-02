package com.docsconsole.tutorials;



public class UnCheckedExceptionExample {
    public void getFileContent() {
        String string = null;
        Boolean isStringEmpty = string.isEmpty();
        System.out.println(isStringEmpty);

    }

    public static void main(String[] args) {
        new UnCheckedExceptionExample().getFileContent();
    }
}