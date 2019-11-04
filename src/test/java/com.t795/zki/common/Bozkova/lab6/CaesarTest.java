package com.t795.zki.common.Bozkova.lab6;

import com.t795.zki.common.bo.message.StreamMessage;
import com.t795.zki.common.cipher.SystemCaesar;
import org.testng.annotations.Test;
import org.testng.Assert;

class CaesarTest {

    @Test
    public void SystemCaesarTest8() {
        SystemCaesar caesar = new SystemCaesar("АЛГОРИТМ", 8);
        StreamMessage actualResult = caesar.getCipher();
        Assert.assertEquals(actualResult.getMessage(), "ЗУКЦЩРЫФ");
    }

    @Test
    public void SystemCaesarTest9() {
        SystemCaesar caesar = new SystemCaesar("ПРОГРАММИРОВАНИЕ", 9);
        StreamMessage actualResult = caesar.getCipher();
        Assert.assertEquals(actualResult.getMessage(), "ЩЪШЛЪИЧЧСЪШКИЦСН");
    }

    @Test
    public void SystemCaesarTest10() {
        SystemCaesar caesar = new SystemCaesar("КРИПТОГРАФИЯ", 10);
        StreamMessage actualResult = caesar.getCipher();
        Assert.assertEquals(actualResult.getMessage(), "ФЫТЪЭЩМЫЙЯТИ");
    }
}
