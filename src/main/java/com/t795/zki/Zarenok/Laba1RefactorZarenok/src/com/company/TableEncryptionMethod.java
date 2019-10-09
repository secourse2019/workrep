package com.company;

public class TableEncryptionMethod implements Encryptable {
    private String key;
    private BlockMessage message;

    public TableEncryptionMethod(){}

    public TableEncryptionMethod(BlockMessage message, String key) {
        this.setMessage(message);
        this.setKey(key);
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public BlockMessage getMessage() {
        return message;
    }

    public void setMessage(BlockMessage message) {
        this.message = message;
    }

    @Override
    public AbstractMessage encrypt() {
        AbstractMessage newMessage = new AbstractMessage();
        for(int i = 0; i != this.message.getRows(); ++i) {
            newMessage.setColByIndex(this.message.getRowByIndex(i), i);
        }
        return newMessage;
    }
}
