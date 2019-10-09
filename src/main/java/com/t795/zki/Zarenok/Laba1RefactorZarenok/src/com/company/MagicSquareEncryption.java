package com.company;

public class MagicSquareEncryption {
    MagicSquareCreator magicBox;
    int[] magicCode;

    public MagicSquareEncryption(MagicSquareCreator magicBox, int[] magicCode) {
        this.setMagicBox(magicBox);
        this.setMagicCode(magicCode);
    }

    public int[] getMagicCode() {
        return magicCode;
    }

    public void setMagicCode(int[] magicCode) {
        this.magicCode = magicCode;
    }

    public MagicSquareCreator getMagicBox() {
        return magicBox;
    }

    public void setMagicBox(MagicSquareCreator magicBox) {
        this.magicBox = magicBox;
    }

    public String encrypt() {
        char[] temp = this.magicBox.createMS();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i != temp.length; ++i) {
            result.append(temp[--this.magicCode[i]]);
        }
        return result.toString();
    }
}
