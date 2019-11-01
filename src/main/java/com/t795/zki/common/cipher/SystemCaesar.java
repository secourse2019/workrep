package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.AbstractMessage;
import com.t795.zki.common.bo.message.StreamMessage;

public class SystemCaesar implements ICipher{

    SystemCaesar(int value) {};

    private void changeInstance(StreamMessage message) {

    }

    public StreamMessage  encrypt(StreamMessage message) {

        return new StreamMessage(message);
    }

    public StreamMessage  decrypt(StreamMessage message) {

        return new StreamMessage(message);
    }

    private int rolling(int value, int index) {
        return value;
    }
}