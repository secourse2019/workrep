package com.t795.trpo.Korobanko.lab5;
import com.t795.trpo.Korobanko.laba5.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

class TestSum{

    @Test
    public void testInt(){
        int a = 1;
        int b = 2;
        int t = 3;
        int r = Calculator.addNumbers(a, b).intValue();
        Assert.assertEquals(t, r);
    }

    @Test
    public void testDouble(){
        double r = Calculator.addNumbers(10d, 5d).doubleValue();
        Assert.assertEquals(15d, r);
    }

    @Test
    public void testFloat(){
        float r = Calculator.addNumbers(1f, 2f).floatValue();
        Assert.assertEquals(3f, r);
    }

    @Test
    public void testIntDouble(){
        double r = Calculator.addNumbers(10,5d).doubleValue();
        Assert.assertEquals(15d, r);
    }

    @Test
    public void testIntFloat(){
        float r = Calculator.addNumbers(10, 5f).floatValue();
        Assert.assertEquals(15f, r);
    }

    @Test
    public void testFloatDouble(){
        double r = Calculator.addNumbers(10f, 5d).doubleValue();
        Assert.assertEquals(15d, r);
    }

}