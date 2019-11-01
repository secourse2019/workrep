package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.StreamMessage;

public class MagicSquareCipher implements ICipher {

    MagicSquareCipher(){};

    private int[] prepareMagicSquare(){
        return new int[0];
    }

    public StreamMessage encrypt(String message) {

        return new StreamMessage(message);
    }

    public StreamMessage  decrypt(String message) {

        return new StreamMessage(message);
    }

    public void setMessage(String a) {

    }

    public void setKey(String a) {

    }

    void setMessage(String a) {

    }

    void setKey(String a) {

    }

    public StreamMessage getMessage() {
        return null;
    }

    public StreamMessage getKey() {
        return null;
    }
}
