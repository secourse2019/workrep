package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.AbstractMessage;
import com.t795.zki.common.bo.message.BlockMessage;
import com.t795.zki.common.bo.message.StreamMessage;

public class SystemTrisimusCipher implements ICipher{

    SystemTrisimusCipher(String message, String key){};

    public StreamMessage encrypt(StreamMessage message) {

        return new StreamMessage(message);
    }

    public StreamMessage decrypt(StreamMessage message) {

        return new StreamMessage(message);
    }

    private void includeLetters(String key) {

    }

    private void includeSecondPart(int index) {

    }

    private void toMatrixBox() {

    }

    private boolean isInUnity(int ind, char value) {
        return false;
    }

    private void fillCipher(String message) {

    }

    private void fillInstance(String message) {

    }

    private void changeInstance(String message) {

    }

    public BlockMessage getMessage() {
        return new BlockMessage();
    }

    public AbstractMessage encrypt(AbstractMessage message) {
        return null;
    }

    public AbstractMessage decrypt(AbstractMessage message) {
        return null;
    }
}