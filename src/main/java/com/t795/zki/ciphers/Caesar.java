package com.t795.zki.ciphers;

import com.t795.zki.common.bo.message.StreamMessage;
import com.t795.zki.common.cipher.SystemCaesar;

public class Caesar implements SystemCaesar {

        private String message;
        private int delta;
        private char[] instance;

        Caesar(String message, int value) {
            this.message = message;
            this.delta = value;
            this.instance = message.toCharArray();
        }

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

    public StreamMessage encrypt() {
        this.Shift(this.delta);
        return new StreamMessage( new java.lang.String(instance) );
    }

    public StreamMessage decrypt() {
        this.Shift( -(this.delta));
        return new StreamMessage(new java.lang.String(instance)  );
    }
}


