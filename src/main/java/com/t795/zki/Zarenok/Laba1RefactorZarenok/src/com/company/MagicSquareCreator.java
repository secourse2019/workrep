package com.company;

import java.lang.reflect.Array;

public class MagicSquareCreator {
    String key;
    int size;

    MagicSquareCreator(String key) {
        this.key = key;
        this.size = key.length();
    }

    public char[] createMS() {
        StringBuilder copy = new StringBuilder(this.key);
        char temp;
        char[] arr = new char[this.size];
        for(int i = 0; i != this.size; ++i) {
            temp = copy.charAt(0);
            arr[i] = temp;
            copy.delete(0, 1);
        }
        return arr;
    }
}