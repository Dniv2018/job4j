package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    /**
     * Метод проверки класса Turn.
     * Проверка переворота массива с четным количеством элементов
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    /**
     * Метод проверки класса Turn.
     * Проверка переворота массива с нечетным количеством элементов
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {7, 4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4, 7};
        assertThat(result, is(expect));
    }
}