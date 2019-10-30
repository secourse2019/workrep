package tests.com.t795.trpo.kate.lab5;
import com.t795.trpo.vyhouskaya.Calculator;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestCalculate {
    @Test
    public void TestInt(){
        int current = Calculator.Sum(3, 6).intValue();
        Assert.assertEquals(current, 9);
    }

    @Test
    public void TestDouble() {
       double current = Calculator.Sum(1.3d, 3.1d).doubleValue();
       Assert.assertEquals(current, 4.4d );
    }

    @Test
    public void TestFloat() {
        float current = Calculator.Sum(1.33f, 4.67f).floatValue();
        Assert.assertEquals(current, 6f);
    }

    @Test
    public void TestIntDouble() {
        double current = Calculator.Sum(1, 5.5d).doubleValue();
        Assert.assertEquals(current, 6.5d);
    }

    @Test
    public void TestIntFloat() {
        float current = Calculator.Sum(3, 5.5f).floatValue();
        Assert.assertEquals(current, 8.5f);
    }

    @Test
    public void TestDoubleFloat() {
        float current = Calculator.Sum(3.5f, 5.2f).floatValue();
        Assert.assertEquals(current, 8.7f);
    }
}
