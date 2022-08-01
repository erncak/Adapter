package com.company;

public class BufferPrintAdapter implements CharPrinter{
    private BufferPrint bufferPrint;

    public BufferPrintAdapter(BufferPrint bufferPrint) {
        this.bufferPrint = bufferPrint;
    }

    @Override
    public void print(String text) {
        bufferPrint.printBuffer(text);
    }
}
