package com.t795.trpo.vorobyov.lab4;

import org.testing.Assert;
import org.testing.annotations.Test;

public class CalculatorTest {
    @Test
    public void testIntSum() {
        int result = Calculator.Sum(6, 5).intValue();
        Assert.assertEquals(12, result)
    }

    @Test
    public void testDoubleSum(){
        double result = Calculator.Sum(12d, 5d).doubleValue();
        Assert.assertEquals(12d, result);
    }

    @Test
    public void testFloatSum(){
        float result = Calculator.Sum(12f, 5f).floatValue();
        Assert.assertEquals(12f, result);
    }

    @Test
    public void testDoubleSum(){
        double result = Calculator.Sum(12, 5d).doubleValue();
        Assert.assertEquals(12d, result);
    }

    @Test
    public void testIntFloatSum(){
        float r = Calculator.Sum(12, 5f).floatValue();
        Assert.assertEquals(12f, result);
    }

    @Test
    public void testFloatDoubleSum(){
        double r = Calculator.Sum(10f, 5d).doubleValue();
        Assert.assertEquals(15d, result);
    }
}
