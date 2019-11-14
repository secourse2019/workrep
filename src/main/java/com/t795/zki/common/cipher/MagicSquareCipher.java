package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.AbstractMessage;
import com.t795.zki.common.bo.message.StreamMessage;

public class MagicSquareCipher implements ICipher {

    private String key;
    private String message;

    public MagicSquareCipher(String key) {
        this.key = key;
    }

    private int[] prepareMagicSquare(String magicSquare) {
        int[] result = new int[magicSquare.length()];
        char[] temp = magicSquare.toCharArray();
        for(int i = 0; i < temp.length; i++)
        {
            result[i] = temp[i];
        }
        return result;
    }

    public AbstractMessage encrypt() {
        int[] keyMS = prepareMagicSquare(key);
        char[] text = message.toCharArray();
        String result = "";
        for(int i = 0; i < keyMS.length; i++)
        {
            result += text[keyMS[i]];
        }
        return new StreamMessage(result);
    }

    public AbstractMessage decrypt() {
        int[] keyMS = prepareMagicSquare(key);
        char[] text = encrypt().getMessage().toCharArray();
        char[] result = new char[keyMS.length];
        for(int i = 0; i < keyMS.length; i++)
        {
            result[keyMS[i]] = text[i];
        }
        return new StreamMessage(toStr(result));
    }

    private String toStr(char[] arr) {
        String result = "";
        for (int i = 0; i !=arr.length; ++i) {
            result += arr[i];
        }
        return result;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public StreamMessage getKey() {
        return new StreamMessage(this.key);
    }
}
