package com.t795.zki.ciphers;

import com.t795.zki.common.bo.message.StreamMessage;

public class SystemCaesar {

        private String message;
        private int value;
        private char[] instance;

        SystemCaesar(String message, int value) {
            this.message = message;
            this.value = value;
            instance = message.toCharArray();
        }


        private void ChangeInstanse(int value) {
            for(int i = 0; i != instance.length; ++i) {

                instance[i] = (char)((int)rolling(value, i));

            }
        }


        private int rolling(int value, int index) {
            int number = ((int)instance[index] + value);

            int lastCharacter = (int)'\uFFEF';

            if (number > lastCharacter)
            {
                number -= lastCharacter;
            }

            if (number < 0) {
                number += lastCharacter;
            }
            return number;
        }


        public StreamMessage getCipher() {
            ChangeInstanse(this.value);
            StreamMessage result = new StreamMessage( new String(instance) );
            return result;
        }

        public StreamMessage getDeCipher() {
        ChangeInstanse( -(this.value));
        StreamMessage result = new StreamMessage( new String(instance) );
        return result;
    }

    }


