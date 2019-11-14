package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.AbstractMessage;
import com.t795.zki.common.bo.message.StreamMessage;

public class SystemCaesar implements ICipher{

    private int delta;
    private char[] instance;

    SystemCaesar(String message, int value) {
        this.delta = value;
        this.instance = message.toCharArray();
    };


    private void Shift(int value) {

        for(int i = 0; i != instance.length; ++i) {
            instance[i] = rolling(value, i);
        }
    }

    private char rolling(int value, int index) {
        int number = ((int)instance[index] + value);

        int lastCharacter = (int)'\uFFEF';

        if (number > lastCharacter) {
            number -= lastCharacter;
        }
        if (number < 0) {
            number += lastCharacter;
        }
        return (char)number;
    }


    public AbstractMessage encrypt() {
        this.Shift(this.delta);
        return new StreamMessage( new java.lang.String(instance) );
    }

    public AbstractMessage decrypt() {
        this.Shift( -(this.delta));
        return new StreamMessage(new java.lang.String(instance)  );
    }
}