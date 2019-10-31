package com.t795.zki.common.bo.message.functionSignatures;

interface KeyCryptorMethod {

    StreamMassage  encryptor(String message);
    StreamMassage  decryptor(String message);
    void setMessage(String a);
    void setKey(String a);
    String getMessage();
    String getKey();
}