package ru.job4j.array;

public class MatrixCheck {

    /**
     * Проверка квадратного массива на заполненость одинаковыми значениями каждой его диагоналей отдельно
     * @author Dmitry Nikolaev (dymy@yandex.ru)
     * @since 2019-06-16
     * @param data двумерный boolean-массив.
     * @return result boolean-значение.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int len = data.length - 1;
        boolean downForm = data [0][0];
        boolean upForm = data [len][0];
        for (int i = 1; i <= len; i++) {
            if ((data[i][i] != downForm) || (data[len - i][i] != upForm)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
