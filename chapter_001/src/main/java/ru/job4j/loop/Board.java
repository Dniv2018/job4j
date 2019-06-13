package ru.job4j.loop;

/**
 * @author Petr Arsentev (parsentev@yandex.ru), Dmitry Nikolaev (dymy@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Board {
    /**
     * Формирует в буфере строку выводящую псевдошахматную доску.
     * @param width Ширина доски в псевдоклетках.
     * @param height Высота доски в псевдоклетках.
     * @return Строка выводящая псевдошахматную доску.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}