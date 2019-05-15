package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    /**
     * Метод проверки метода indexOf класса FindLoop
     * Проверка нахождения индекса (0) элемента массива, где находится значение 5
     */
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * Метод проверки метода indexOf класса FindLoop
     * Проверка ненахождения индекса массива где находится значение 5
     * Результат считается верным, если тест выдал ошибку (Элемента со значением 5 нет вообще)
     */
    @Test
    public void whenArrayNotHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {8, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * Метод проверки метода indexOf класса FindLoop
     * Проверка нахождения индекса (2) элемента массива где находится значение 5
     */

    @Test
    public void whenArrayHas5Then2() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {8, 10, 5};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }
}