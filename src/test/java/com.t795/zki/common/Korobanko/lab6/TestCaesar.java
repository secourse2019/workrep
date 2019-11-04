package com.t795.zki.common.Korobanko.lab6;
import com.t795.zki.common.bo.message.StreamMessage;
import com.t795.zki.common.cipher.SystemCaesar;
import org.testng.Assert;
import org.testng.annotations.Test;

class TestCaesar {
    @Test
    public void test14() {
        SystemCaesar enc = new SystemCaesar("ТЕЛЕФОН", 14);
        StreamMessage actualResult = enc.getCipher();
        Assert.assertEquals(actualResult.getMessage(),"бтътгэ");
    }

    @Test
    public void test15() {
        SystemCaesar enc = new SystemCaesar("КОМПЬЮТЕР", 15);
        StreamMessage actualResult = enc.getCipher();
        Assert.assertEquals(actualResult.getMessage(),"ъюьякмвуа");
    }

    @Test
    public void test16() {
        SystemCaesar enc = new SystemCaesar("ЧАСЫ", 16);
        StreamMessage actualResult = enc.getCipher();
        Assert.assertEquals(actualResult.getMessage(),"ёпвк");
    }
}