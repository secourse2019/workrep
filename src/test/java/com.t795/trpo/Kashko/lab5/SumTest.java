package com.t795.trpo.Kashko.lab5;

import com.t795.trpo.Kashko.laba5.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SumTest {

    @Test
    public void TestInt(){
        int current = Calculator.Sum(34, 6).intValue();
        Assert.assertEquals(current, 40);
    }

    @Test
    public void TestDouble() {
        double current = Calculator.Sum(1.1d, 1.2d).doubleValue();
        Assert.assertEquals(current, 2.3d );
    }

    @Test
    public void TestFloat() {
        float current = Calculator.Sum(8.67f, 1.33f).floatValue();
        Assert.assertEquals(current, 10f);
    }

    @Test
    public void TestIntDouble() {
        double current = Calculator.Sum(10, 3.33d).doubleValue();
        Assert.assertEquals(current, 13.33d);
    }

    @Test
    public void TestIntFloat() {
        float current = Calculator.Sum(4, 2.66f).floatValue();
        Assert.assertEquals(current, 6.66f);
    }

    @Test
    public void TestDoubleFloat() {
        float current = Calculator.Sum(3.1d, 7.2f).floatValue();
        Assert.assertEquals(current, 10.3f);
    }

    @Test
    public void TestDoubleInt() {
        double current = Calculator.Sum(8.5d, 2).doubleValue();
        Assert.assertEquals(current, 10.5d);
    }

    @Test
    public void TestFloatInt() {
        float current = Calculator.Sum(15.02f, 5).floatValue();
        Assert.assertEquals(current, 20.02f);
    }

    @Test
    public void TestFloatDouble() {
        float current = Calculator.Sum(3.33f, 3.33d).floatValue();
        Assert.assertEquals(current, 6.66f);
    }


}
