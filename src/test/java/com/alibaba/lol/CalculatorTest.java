package com.alibaba.lol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.hamcrest.Matchers;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    /**
     * Basic unit test example
     */
    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }

    /**
     * Mockito example
     */
    @Test
    public void add() {
        Number a = Mockito.mock(Number.class);
        Number b = Mockito.mock(Number.class);
        Mockito.when(a.intValue()).thenReturn(100);
        Mockito.when(b.intValue()).thenReturn(1);
        Calculator calculator = new Calculator();
        Assert.assertEquals(101, calculator.add(a, b));
        Mockito.verify(a).intValue();
        Mockito.verify(b).intValue();
    }

    /**
     * Hamcrest example
     */
    @Test
    public void sub() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(103, 2);
        Assert.assertThat(result, Matchers.equalTo(101));
    }
}
