package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.StreamMessage;

public interface SystemCaesar {

    SystemCaesar(String message, int value);

    private void ChangeInstanse(int value);

    private int rolling(int value, int index);

    public StreamMessage Shift(int value);

}