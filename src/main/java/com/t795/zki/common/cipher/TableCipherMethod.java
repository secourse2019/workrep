package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.AbstractMessage;
import com.t795.zki.common.bo.message.BlockMessage;
import com.t795.zki.common.bo.message.StreamMessage;

public class TableCipherMethod implements ICipher {

    TableCipherMethod(String message, int value){};

    public AbstractMessage encrypt(AbstractMessage message) {
        return null;
    }

    public AbstractMessage  decrypt(AbstractMessage message) {
        return null;
    }

    private void changeInstanse(String message) {

    }

    private int rolling(int value, int index) {

        return value;
    }

    public void setMessage(String a) {

    }

    public void setKey(String a) {

    }

    public void setKey(String a) {

    }

    public StreamMessage getKey() {
        return null;
    }

    public BlockMessage getMessage() {
        return null;
    }
}
