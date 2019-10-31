package com.t795.zki.common.bo.message.functionSignatures;

public class SystemCaesar {

    SystemCaesar(String message, int value) {};

    private void ChangeInstanse(int value) {

    }

    private int rolling(int value, int index) {
        return value;
    }

    public StreamMessage getCipher() {
        return new StreamMessage();
    }

    public StreamMessage getDeCipher() {
        return new StreamMessage();
    }
}