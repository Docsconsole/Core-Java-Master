package com.docsconsole.tutorials;

public class RemoveLeadingTrailingSpaces {
    public static void main(String[] args) {
        String string = " test test\n";
        System.out.println(string.strip());
    }
}
