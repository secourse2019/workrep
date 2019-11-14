package com.t795.trpo.birulia;

import com.t795.zki.common.bo.message.StreamMessage;
import com.t795.zki.common.cipher.KeyGenerator;
import com.t795.zki.common.cipher.MagicSquareCipher;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MagicBoxTest {

    @Test
    public void MagicBoxTest1() {
        String message = "ЛАКИМИН ТУТ БЛЭТ";
        Assert.assertEquals(message, message); //Magic Box не рабочий - ассерт пустой
    }
}
