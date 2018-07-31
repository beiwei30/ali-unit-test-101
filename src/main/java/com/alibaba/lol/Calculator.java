package com.alibaba.lol;

public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand : expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }

    public int add(Number a, Number b) {
        return a.intValue() + b.intValue();
    }

    public int sub(Number a, Number b) {
        return a.intValue() - b.intValue();
    }
}
