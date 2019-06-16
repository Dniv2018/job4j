package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {

    /**
     * Получение символьного массива без дубликатов из исходного символьного массива
     * @author Dmitry Nikolaev (dymy@yandex.ru)
     * @since 2019-06-16
     * @param array исходный символьный массив.
     * @return символьный массив без дубликатов.
     */
    public String[] remove(String[] array) {
        int len = array.length - 1; // максимальный индекс массива
        int count = 0; // счетчик дубликатов
        for (int j = 0; j <= len - count; j++) {
            for (int i = j + 1; i <= len - count; i++) {
                if (array[i].equals(array[j])) {
                    for (int a = i; a < len - count; a++) { // сдвигаем все элементы массива на 1 влево
                        array[a] = array[a + 1];
                    }
                    ++count; // увеличиваем счетчик повторов на 1
                    --i; // уменьшаем счетчик проверяемой позиции на 1, чтобы начать проверку с прежней позиции,
                         // где хранится уже новое значение
                }
            }
        }
        return Arrays.copyOf(array, len + 1 - count);
    }
}
