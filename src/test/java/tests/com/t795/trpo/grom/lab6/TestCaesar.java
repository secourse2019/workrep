package tests.com.t795.trpo.grom.lab6;

import com.t795.zki.common.bo.message.StreamMessage;
import com.t795.zki.common.cipher.SystemCaesar;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestCaesar {
    @Test
    public void task5(){
        int k = 5;
        String message = "Весна";
        String expectedResult = "Жйцте";
        SystemCaesar caesar = new SystemCaesar(message,k);
        StreamMessage actualResult = caesar.getCipher();
        Assert.assertEquals(actualResult.getMessage(), expectedResult);
    }

    @Test
    public void task6(){
        int k = 6;
        String message = "Зима";
        String expectedResult = "Нотё";
        SystemCaesar caesar = new SystemCaesar(message,k);
        StreamMessage actualResult = caesar.getCipher();
        Assert.assertEquals(actualResult.getMessage(), expectedResult);
    }

    @Test
    public void task7(){
        int k = 7;
        String message = "Зима";
        String expectedResult = "Чщлфг";
        SystemCaesar caesar = new SystemCaesar(message,k);
        StreamMessage actualResult = caesar.getCipher();
        Assert.assertEquals(actualResult.getMessage(), expectedResult);
    }

}
