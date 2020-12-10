package ru.job4j.tracker.oop;

/**
 * Поиск большего из двух чискл
 * @author Dmitry Nikolaev (dymy@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    //int result;
    /**
     * Находит большее из чисел.
     * @param first Первое число.
     * @param second Второе число.
     * @return Большее из чисел.
     */
    public int max(int first, int second) {
        return second > first ? second : first;
    }
    /**
     * Находит большее из чисел.
     * @param first Первое число.
     * @param second Второе число.
     * @param third Третье число.
     * @return Большее из чисел.
     */
    public int max(int first, int second, int third) {
        return max(first, max(second, third));
        //int result = max(second, third);
        //return first > result ? first : result;
    }
    /**
     * Находит большее из чисел.
     * @param first Первое число.
     * @param second Второе число.
     * @param third Третье число.
     * @param fourth Четвертое число.
     * @return Большее из чисел.
     */
    public int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
        //int result = max(second, third, fourth);
        //return first > result ? first : result;
    }
}
