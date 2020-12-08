package ru.job4j.tracker.oop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    /**
     * Проверка двух чисел
     */
    @Test
    public void twoNumbers() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }

    /**
     * Проверка трех чисел
     */
    @Test
    public void threeNumbers() {
        Max maxim = new Max();
        int result = maxim.max(2, 1, 3);
        assertThat(result, is(3));
    }

    /**
     * Проверка четырех чисел
     */
    @Test
    public void fourNumbers() {
        Max maxim = new Max();
        int result = maxim.max(2, 3, 5, 1);
        assertThat(result, is(5));
    }
}
