package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
       Factorial result = new Factorial();
       assertThat (result.calc(5), is(120));//напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial result = new Factorial();
        assertThat (result.calc(0), is(1));
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
    }
}
