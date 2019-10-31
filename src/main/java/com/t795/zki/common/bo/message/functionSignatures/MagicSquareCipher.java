package com.t795.zki.common.bo.message.functionSignatures;


public class MagicSquareCipher implements KeyCryptorMethod {

    MagicSquareCipher(){};

    private int[] prepareMagicSquare(){
        return new int[0];
    }

    public StreamMassage  encryptor(String message) {

        return new StreamMessage();
    }

    public StreamMassage  decryptor(String message) {

        return new StreamMessage();
    }

    public void setMessage(String a) {

    }

    public void setKey(String a) {

    }

    public String getMessage() {
        return null;
    }

    public String getKey() {
        return null;
    }
}
