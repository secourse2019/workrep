package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.StreamMessage;

public class SystemCaesar {

    public SystemCaesar(String message, int value) {};

    private void ChangeInstanse(int value) {

    }

    private int rolling(int value, int index) {
        return value;
    }

    public StreamMessage getCipher() {
        return null;
    }

    public StreamMessage getDeCipher(String message) {
        return new StreamMessage(message);
    }
}