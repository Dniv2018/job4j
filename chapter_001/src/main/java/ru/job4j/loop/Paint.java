package ru.job4j.loop;

/**
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class Paint {


    /**
     * Метод формирует в буфере строку выводящую правую часть пирамиды.
     * @param height Высота пирамиды в строках.
     * @return Строка выводящая правую часть пирамиды.
     */
    public String rightTrl(int height) {
        // Буфер для результата.
        StringBuilder screen = new StringBuilder();
        // ширина будет равна высоте.
        //int width = height;
        // внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
            // внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column != height; column++) {
                // если строка больше или равна ячейке, то рисуем галку.
                // в данном случае строка определяет, сколько галок будет в строке
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        // Получаем результат.
        return screen.toString();
    }


    /**
     * Метод формирует в буфере строку выводящую левую часть пирамиды.
     * @param height Высота пирамиды в строках.
     * @return Строка выводящая левую часть пирамиды.
     */
    public String leftTrl(int height) {
        // Создаем еще 1 буфер для результата.
        StringBuilder screen = new StringBuilder();
        //int width = height;
        // внешний цикл переключается по строкам.
        for (int row = 0; row != height; row++) {
            // внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column != height; column++) {
                // если строка больше или равна обратному значению номера ячейки, то рисуем галку.
                if (row >= height- column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }


    /**
     * Метод формирует в буфере строку выводящую пирамиду.
     * @param height Высота пирамиды в строках.
     * @return Строка выводящая пирамиду.
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int width= 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != width; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}