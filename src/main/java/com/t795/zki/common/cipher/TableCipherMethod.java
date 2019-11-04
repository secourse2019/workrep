package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.StreamMessage;

public abstract class TableCipherMethod implements KeyCryptorMethod {

    TableCipherMethod(String message, int value){};

    public StreamMessage  encryptor(String message) {
        return null;
    }

    public StreamMessage  decryptor(String message){
        return null;
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
        return null;
    }

    public StreamMessage getKey() {
        return null;
    }
}
