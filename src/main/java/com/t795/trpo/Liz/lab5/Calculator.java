package com.t795.trpo.Liz.lab5;

public class Calculator {

    public static Number Sum(Number first, Number second) {
        if(first instanceof Double || second instanceof Double) {
            return first.doubleValue() + second.doubleValue();
        } else if(first instanceof Float || second instanceof Float) {
            return first.floatValue() + second.floatValue();
        } else if(first instanceof Long || second instanceof Long) {
            return first.longValue() + second.longValue();
        } else {
            return first.intValue() + second.intValue();
        }
    }
}
