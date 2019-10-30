package com.t795.trpo.vorobyov.lab4;

public class Calculator {

    public static Number Sum(Number first, Number second) {

        if(first instanceof Integer || second instanceof Integer)
        {
            return first.intValue() + second.intValue();
        }

        if(first instanceof Double || second instanceof Double) {
            return first.doubleValue() + second.doubleValue();
        }

        if(first instanceof Float || second instanceof Float) {
            return first.floatValue() + second.floatValue();
        }

        if(first instanceof Long || second instanceof Long) {
            return first.longValue() + second.longValue();
        }
        return -1;
    }
}

