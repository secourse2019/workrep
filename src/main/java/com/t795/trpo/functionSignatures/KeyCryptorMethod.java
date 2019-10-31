package com.t795.trpo.functionSignatures;

interface KeyCryptorMethod {

    String encryptor(String message);
    String decryptor(String message);
    void setMessage(String a);
    void setKey(String a);
    String getMessage();
    String getKey();
}