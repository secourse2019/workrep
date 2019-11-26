package zki.common.Vyhouskaya.lab6;

import com.t795.zki.common.bo.message.StreamMessage;
import com.t795.zki.common.cipher.SystemCaesar;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaeserTest {
    @Test
    public void test11() {
        SystemCaesar enc = new SystemCaesar("КРИПТОАНАЛИЗ", 11);
        StreamMessage actualResult = enc.getCipher();
        Assert.assertEquals(actualResult.getMessage(),"ХЫУЪЭЩКШКЦУТ");//зашифровать
    }

    @Test
    public void test12() {
        SystemCaesar enc = new SystemCaesar("ШИФРТЕКСТ", 12);
        StreamMessage actualResult = enc.getCipher();
        Assert.assertEquals(actualResult.getMessage(),"ДФАЬЮРЦЭЮ");//зашифровать
    }

    @Test
    public void test13() {
        SystemCaesar enc = new SystemCaesar("ОРЕХИ", 13);
        StreamMessage actualResult = enc.getCipher();
        Assert.assertEquals(actualResult.getMessage(),"ЫЭСВХ");//зашифровать
    }
}
