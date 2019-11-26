package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.AbstractMessage;
import com.t795.zki.common.bo.message.BlockMessage;
import com.t795.zki.common.bo.message.StreamMessage;

public class TableCipherMethod implements ICipher {

    TableCipherMethod(String message, int value){};

    public BlockMessage encrypt(BlockMessage message) {
        return null;
    }

    public BlockMessage  decrypt(BlockMessage message) {
        return null;
    }

    private void changeInstance(String message) {

    }

    private int rolling(int value, int index) {

        return value;
    }

    void setMessage(String a) {

    }

    void setKey(String a) {

    }

    public BlockMessage getKey() {
        return null;
    }

    public BlockMessage getMessage() {
        return null;
    }

    public AbstractMessage encrypt(AbstractMessage message) {
        return null;
    }

    public AbstractMessage decrypt(AbstractMessage message) {
        return null;
    }
}
