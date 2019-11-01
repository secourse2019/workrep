package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.StreamMessage;

interface ICipher {

    StreamMessage encryptor(String message);
    StreamMessage  decryptor(String message);
    void setMessage(String a);
    void setKey(String a);
}