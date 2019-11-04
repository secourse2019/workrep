package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.AbstractMessage;
import com.t795.zki.common.bo.message.BlockMessage;
import com.t795.zki.common.bo.message.StreamMessage;

public class MagicSquareCipher implements ICipher {

    MagicSquareCipher(){};

    private int[] prepareMagicSquare(){
        return new int[0];
    }


    public void encrypt(BlockMessage message) {}

    public StreamMessage encryptor(String message) {


        return new StreamMessage(message);
    }

    public BlockMessage  decrypt(BlockMessage message) {

        return new BlockMessage(message);
    }

    public void setMessage(String a) {

    }

    public void setKey(String a) {

    }

    public BlockMessage getMessage() {
        return null;
    }

    public StreamMessage getKey() {
        return null;
    }

    public AbstractMessage encrypt(AbstractMessage message) {
        return null;
    }

    public AbstractMessage decrypt(AbstractMessage message) {
        return null;
    }
}
