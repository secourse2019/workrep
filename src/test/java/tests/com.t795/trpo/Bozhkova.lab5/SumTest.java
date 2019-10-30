package tests.com.t795.trpo.Bozhkova.lab5;

import com.t795.trpo.Liz.lab5.Calculator;
import org.testng.annotations.Test;
import org.testng.Assert;

class SumTest {
    @Test
    public void testInt(){
        int actual = Calculator.Sum(-1, 5).intValue();
        Assert.assertEquals(actual, 4);
    }

    @Test
    public void testIntDouble(){
        double actual = Calculator.Sum(0, 5.5d).doubleValue();
        Assert.assertEquals(actual, 5.5d);
    }

    @Test
    public void testIntFloat(){
        float actual = Calculator.Sum(0, 5.5f).floatValue();
        Assert.assertEquals(actual, 5.5f);
    }

    @Test
    public void testFloat(){
        float actual = Calculator.Sum(-1.2f, 5.5f).floatValue();
        Assert.assertEquals(actual, 4.3f);
    }

    @Test
    public void testFloatInt(){
        float actual = Calculator.Sum(-1.2f, 5).floatValue();
        Assert.assertEquals(actual, 3.8f);
    }

    @Test
    public void testFloatDouble(){
        float actual = Calculator.Sum(-1.2f, 5.5d).floatValue();
        Assert.assertEquals(actual, 4.3f);
    }

    @Test
    public void testDouble(){
        double actual = Calculator.Sum(-1.2d, 5.5d).doubleValue();
        Assert.assertEquals(actual, 4.3d);
    }

    @Test
    public void testDoubleInt(){
        double actual = Calculator.Sum(-1.2d, 5).doubleValue();
        Assert.assertEquals(actual, 3.8d);
    }

    @Test
    public void testDoubleFloat(){
        double actual = Calculator.Sum(-1.2d, 5.5f).doubleValue();
        Assert.assertEquals(actual, 4.3d);
    }
}
