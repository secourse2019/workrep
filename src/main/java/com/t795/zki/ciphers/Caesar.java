package com.t795.zki.ciphers;

import com.t795.zki.common.bo.message.StreamMessage;
import com.t795.zki.common.cipher.SystemCaesar;

public class Caesar implements SystemCaesar {

        private String message;
        private char[] instance;

        Caesar(String message, int value) {
            this.message = message;
            this.value = value;
            instance = message.toCharArray();
        }

        private void ChangeInstanse(int value) {
            for(int i = 0; i != instance.length; ++i) {

                instance[i] = rolling(value, i);

            }
        }


        private char rolling(int value, int index) {
            int number = ((int)instance[index] + value);

            int lastCharacter = (int)'\uFFEF';

            if (number > lastCharacter)
            {
                number -= lastCharacter;
            }

            if (number < 0) {
                number += lastCharacter;
            }
            return (char)number;
        }


        public StreamMessage Shift (int value) {
        ChangeInstanse(value);
        StreamMessage result = new StreamMessage( new String(instance) );
        return result;
    }

    }


