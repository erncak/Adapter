package com.company;

public class BufferPrint {
    public void printBuffer(String text) {
        String str = text;

        // Creating array of string length
        char[] ch = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i+=2) {
            ch[i] = str.charAt(i);
            ch[i+1]=str.charAt(i+1);
            System.out.println(ch[i]+ " "+ ch[i+1]);


        }


    }
}
