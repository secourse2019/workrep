package com.t795.zki.vorobyov.lab6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CipherTest {

    public void CipherTest() {
        int k = 20;
        String message = "РАБОТА";
        String expectedMessage = "УЩВОАТМ";
        SystemCaesar caesar = new SystemCaesar(message, k);
        StreamMessage actualResult = caesar.getCipher();
        Assert.assertEquals(actualResult.getMessage(), expectedMessage);
    }

    public void CipherTest() {
        int k = 21;
        String message = "СОЛНЦЕ";
        String expectedMessage = "ВРЫТЧЛ";
        SystemCaesar caesar = new SystemCaesar(message, k);
        StreamMessage actualResult = caesar.getCipher();
        Assert.assertEquals(actualResult.getMessage(), expectedMessage);
    }

    public void CipherTest() {
        int k = 22;
        String message = "ПЕРЕМЕНЫ";
        String expectedMessage = "СТМЛАШВ";
        SystemCaesar caesar = new SystemCaesar(message, k);
        StreamMessage actualResult = caesar.getCipher();
        Assert.assertEquals(actualResult.getMessage(), expectedMessage);
    }
}
