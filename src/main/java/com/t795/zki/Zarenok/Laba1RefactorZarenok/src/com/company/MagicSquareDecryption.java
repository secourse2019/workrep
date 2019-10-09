package com.company;

import java.util.HashMap;

public class MagicSquareDecryption {
    private MagicSquareCreator magicBox;
    private int[] magicCode;

    public MagicSquareDecryption(MagicSquareCreator magicBox, int[] magicCode) {
        this.setMagicBox(magicBox);
        this.setMagicCode(magicCode);
    }

    public MagicSquareCreator getMagicBox() {
        return magicBox;
    }

    public void setMagicBox(MagicSquareCreator magicBox) {
        this.magicBox = magicBox;
    }

    public int[] getMagicCode() {
        return magicCode;
    }

    public void setMagicCode(int[] magicCode) {
        this.magicCode = magicCode;
    }

    public String decrypt() {
        StringBuilder result = new StringBuilder();
        char[] temp = this.magicBox.createMS();
        result.setLength(temp.length);
        for(int i = 0; i != temp.length; ++i) {
            result.setCharAt(this.magicCode[i], temp[i]);
        }
        return result.toString();
    }
}
