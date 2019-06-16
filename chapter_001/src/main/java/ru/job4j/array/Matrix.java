package ru.job4j.array;


public class Matrix {

    /**
     * Получение таблицы умножения
     * @author Dmitry Nikolaev (dymy@yandex.ru)
     * @since 2019-06-12
     * @param size размер таблицы умножения.
     * @return table[][] двумерный массив с таблицей умножения.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table [i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
