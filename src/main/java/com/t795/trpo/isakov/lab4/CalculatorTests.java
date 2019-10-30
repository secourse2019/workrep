package com.t795.trpo.isakov.lab4;

import com.t795.trpo.isakov.lab4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTests {
    @Test
    public void TestInt() {
        int current = Calculator.Sum(4, 8).intValue();
        Assert.assertEquals(current, 12);
    }

    @Test
    public void TestDouble() {
        double current = Calculator.Sum(1.5d, 2.5d).doubleValue();
        Assert.assertEquals(current, 4d);
    }

    @Test
    public void TestFloat() {
        float current = Calculator.Sum(1.77f, 2.33f).floatValue();
        Assert.assertEquals(current, 4f);
    }

    @Test
    public void TestIntDouble() {
        double current = Calculator.Sum(1.5d, 5).doubleValue();
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
