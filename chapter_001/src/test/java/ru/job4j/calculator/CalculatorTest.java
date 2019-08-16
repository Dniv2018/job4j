package ru.job4j.calculator;

<<<<<<< HEAD
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
=======

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест простейшего калькулятора.
 * @author Dmitry Nikolaev (dymy@yandex.ru)
 * @since 2018-11-10
 */
public class CalculatorTest {

    /**
     * Метод проверки метода add класса calculator - "сложения двух чисел"
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Метод проверки метода subtract класса calculator - "вычитание"
     */
    @Test
    public void whenAddOneSubtractOneThenTwo() {
        Calculator calc = new Calculator();
        calc.subtract(9D, 2D);
        double result = calc.getResult();
        double expected = 7D;
        assertThat(result, is(expected));
    }

    /**
     * Метод проверки метода div класса calculator - "деление"
     */
    @Test
    public void whenAddOneDivThenTwo() {
        Calculator calc = new Calculator();
        calc.div(9D, 2D);
        double result = calc.getResult();
        double expected = 4.5D;
        assertThat(result, is(expected));
    }

    /**
     * Метод проверки метода multiple класса calculator - "умножение"
     */
    @Test
    public void whenAddOneMultipleOneThenTwo() {
        Calculator calc = new Calculator();
        calc.multiple(4.5D, 2D);
        double result = calc.getResult();
        double expected = 9D;
        assertThat(result, is(expected));
    }
}
>>>>>>> 10fb50ae7d1e3edbd47fe6939990902f86b66dac
