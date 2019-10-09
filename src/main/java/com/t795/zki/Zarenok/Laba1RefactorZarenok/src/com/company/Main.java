package com.company;

import java.awt.desktop.ScreenSleepEvent;

public class Main {

    public static void main(String[] args) {
        MagicSquareCreator a = new MagicSquareCreator("valiktima");
        int[] arr = {4, 2, 1, 3, 7, 6, 5, 8, 9};
        MagicSquareEncryption b = new MagicSquareEncryption(a, arr);
        String encrypt = b.encrypt();
        MagicSquareCreator encryptMB = new MagicSquareCreator(encrypt);
        MagicSquareDecryption c = new MagicSquareDecryption(encryptMB, arr);
        System.out.print(c.decrypt());
    }
}
