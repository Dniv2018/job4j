package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void add(){
        int first = 1;
        int second = 1;
        int expected = 2;
        int result = Calculator.add(first, second);
        Assert.assertEquals(expected, result);
    }
}
