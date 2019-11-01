package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.StreamMessage;

public class SystemCaesar implements ICipher{

    SystemCaesar(String message, int value) {};

    private void changeInstance(String message) {

    }

    public StreamMessage  encryptor(String message) {

        return new StreamMessage(message);
    }

    public StreamMessage  decryptor(String message) {

        return new StreamMessage(message);
    }

    private int rolling(int value, int index) {
        return value;
    }
}