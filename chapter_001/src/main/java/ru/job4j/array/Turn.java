package ru.job4j.array;

/**
 * Переворот (отзеркаливание) массива.
 * @author Dmitry Nikolaev (dymy@yandex.ru)
 * @since 2019-06-12
 */
public class Turn {
    public int[] back(int[] array) {
        int broker;
        for (int index = 0; index < array.length / 2; index++) {
        broker = array[index];
        array[index] = array[array.length - 1 - index];
        array[array.length - 1 - index] = broker;
        }
        return array;
    }
}
