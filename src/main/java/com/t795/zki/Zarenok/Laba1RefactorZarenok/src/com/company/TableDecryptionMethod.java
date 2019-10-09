package com.company;

public class TableDecryptionMethod implements Decryptable {
    private String key;
    private BlockMessage cipherText;

    public TableDecryptionMethod(){}

    public TableDecryptionMethod(BlockMessage cipherText, String key){
        this.setCipherText(cipherText);
        this.setKey(key);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public BlockMessage getCipherText() {
        return cipherText;
    }

    public void setCipherText(BlockMessage cipherText) {
        this.cipherText = cipherText;
    }

    @Override
    public AbstractMessage decrypt() {
        AbstractMessage newMessage = new AbstractMessage();
        for(int i = 0; i != this.cipherText.getRows(); ++i) {
            newMessage.setColByIndex(this.cipherText.getRowByIndex(i), i);
        }
        return newMessage;
    }
}
