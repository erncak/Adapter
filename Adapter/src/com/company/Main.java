package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CharPrinter charPrinter = new PrinterChar();
        charPrinter.print("Lab Week 07");
        BufferPrint bufferPrint= new BufferPrint();
        charPrinter = new BufferPrintAdapter(bufferPrint);
        charPrinter.print("Lab Week 07");



    }
}
