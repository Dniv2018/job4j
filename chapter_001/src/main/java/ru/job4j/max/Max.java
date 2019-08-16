package ru.job4j.max;

/**
 * Поиск большего из двух чискл
 * @author Dmitry Nikolaev (dymy@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    int result;
    /**
     * Находит большее из двух чисел.
     * @param first Меньшее число.
     * @param second Большее число.
     * @return result Ответ.
     */
    public int max(int first, int second) {
       result = second > first ? second : first;
        return result;
    }
}
