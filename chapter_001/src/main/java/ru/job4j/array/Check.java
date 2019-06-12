package ru.job4j.array;

/**
 * Проверка boolean-массива на заполненость только true или только false.
 * @author Dmitry Nikolaev (dymy@yandex.ru)
 * @since 2019-06-12
 */
public class Check {
    public boolean mono(boolean[] data) {
        boolean broker = data[data.length-1];
        for (boolean i: data) {
            if (i ^ broker) return false;
        }
        return true;
    }
}