package com.t795.zki.common.cipher;

import com.t795.zki.common.bo.message.StreamMessage;

interface ICipher {

    StreamMessage encryptor(String message);
    StreamMessage  decryptor(String message);
}