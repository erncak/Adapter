package com.company;

public class PrinterChar implements CharPrinter{
    @Override
    public void print(String text) {
        String str = text;

        // Creating array of string length
        char[] ch = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            System.out.println(ch[i]);
        }

    }
}
