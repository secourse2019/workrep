package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.StreamMessage;

public class MagicSquareCipher implements KeyCryptorMethod {

    MagicSquareCipher(){};

    private int[] prepareMagicSquare(){
        return new int[0];
    }

    public StreamMessage encryptor(String message) {

        return new StreamMessage();
    }

    public StreamMessage  decryptor(String message) {

        return new StreamMessage();
    }

    public void setMessage(String a) {

    }

    public void setKey(String a) {

    }

    public StreamMessage getMessage() {
        return null;
    }

    public StreamMessage getKey() {
        return null;
    }
}
