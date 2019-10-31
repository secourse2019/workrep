package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.StreamMessage;

public class TableCipherMethod implements KeyCryptorMethod {

    TableCipherMethod(String message, int value){};

    public StreamMessage  encryptor() {

    }

    public StreamMessage  decryptor() {

    }

    private void ChangeInstanse(int value) {

    }

    private int rolling(int value, int index) {

        return value;
    }

    public void setMessage(String a) {

    }

    public void setKey(String a) {

    }

    public StreamMessage getMessage() {
        return  new StreamMessage();
    }

    public StreamMessage getKey() {
        return new StreamMessage();
    }
}
