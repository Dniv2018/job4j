package ru.job4j.array;

/**
 * Поиск индекса элемента удовлетворяющего условию.
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @since 2019-05-12
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index=0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
