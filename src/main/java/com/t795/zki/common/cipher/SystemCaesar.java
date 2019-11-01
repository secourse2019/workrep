package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.AbstractMessage;
import com.t795.zki.common.bo.message.StreamMessage;

public class SystemCaesar implements ICipher{

    SystemCaesar(int value) {};

    private void changeInstance(String message) {

    }

    public AbstractMessage  encrypt(AbstractMessage message) {

        return new StreamMessage(message);
    }

    public AbstractMessage  decrypt(AbstractMessage message) {

        return new StreamMessage(message);
    }

    private int rolling(int value, int index) {
        return value;
    }
}