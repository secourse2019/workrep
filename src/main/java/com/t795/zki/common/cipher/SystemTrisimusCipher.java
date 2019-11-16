package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.AbstractMessage;
import com.t795.zki.common.bo.message.BlockMessage;
import com.t795.zki.common.bo.message.StreamMessage;

public class SystemTrisimusCipher implements ICipher{
    private char[] box;
    private char[][] matrixBox;
    private char[] cipher;
    private char[] instance;
    private String key;
    private String message;

    SystemTrisimusCipher(String message, String key){
        this.box = new char[32];
        this.matrixBox = new char[4][8];
        this.message = key;
        this.key = key;
        this.cipher = new char[message.length()];
        this.instance = new char[message.length()];
    };

    private void includeLetters(String key) {
        int j = 0;
        for(int i = 0; i != key.length(); ++i) {
            if(isInUnity(j, key.charAt(i))) {
                box[j++] = key.charAt(i);
            }
        }
        includeSecondPart(j);
    }

    private void includeSecondPart(int index) {
        for(int i = index,  number  = 1040; i != box.length; ++number) {
            if(isInUnity(i, (char)number) && number != 1098) {
                box[i++] = (char)number;
            }
        }
        toMatrixBox();
    }

    private void toMatrixBox() {
        for(int i = 0, temp = 0; i != 4; ++i) {
            for(int j = 0; j != 8; ++j, ++temp) {
                matrixBox[i][j] = box[temp];
            }
        }
        fillCipher(this.message);
    }

    private boolean isInUnity(int ind, char value) {
        for(int i = 0; i < ind; ++i) {
            if(box[i] == value) {
                return false;
            }
        }
        return true;
    }

    private void fillCipher(String message) {
        for(int i = 0; i != message.length(); ++i) {
            cipher[i] = (char)((int)message.charAt(i));
        }
        fillInstance();
    }

    private void fillInstance() {
        for(int i = 0; i != cipher.length; ++i) {
            if(cipher[i] >= 1040 && cipher[i] <= 1071) {
                instance[i] = cipher[i];
            } else {
                instance[i] = ' ';
            }
        }
        ChangeInstanse();
    }

    private void ChangeInstanse() {
        for(int i = 0, temp = 0; i != 4; ++i) {
            for(int j = 0; j != 8; ++j) {
                if(instance[temp] == ' ') {
                    temp++;
                    i = 0;
                    j = -1;
                } else if((instance[temp] == matrixBox[i][j] || instance[temp] == ' ') && temp < instance.length - 1) {
                    if(i == 0) {
                        instance[temp] = matrixBox[3][j];
                    } else {
                        instance[temp] = matrixBox[i - 1][j];
                    }
                    i = 0;
                    j = -1;
                    temp++;
                }

            }
        }
        insertElements();
    }

    private void insertElements() {
        for(int i = 0; i != instance.length; ++i) {
            if(instance[i] == ' ') {
                instance[i] = cipher[i];
            }
        }
    }

    public String get() {
        String result = new String(instance);
        return result;
    }

    public AbstractMessage encrypt() {
        includeLetters(key);
        return new StreamMessage(new String(instance));
    }

    public AbstractMessage decrypt() {
        SystemTrisimusCipher decrypt = new SystemTrisimusCipher(this.encrypt().getMessage(), this.key);
        return decrypt.encrypt();
    }
}