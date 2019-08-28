package ru.job4j.array;

/**
 * Заполнение массива квадратами числовой последовательности от 1 до bound.
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @since 2019-05-12
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < bound; index++) {
            rst[index] = (index + 1) * (index + 1);
        }
        return rst;
    }
}