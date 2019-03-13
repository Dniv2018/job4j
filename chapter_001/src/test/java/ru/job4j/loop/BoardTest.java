package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru), Dmitry Nikolaev (dymy@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class BoardTest {
    @Test
    public void when3x3() {
        Board board_3x3 = new Board();
        String rsl_3x3 = board_3x3.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rsl_3x3, is(
                String.format("X X%s X %sX X%s", ln, ln, ln)
                )
        );
        System.out.format("Доска 3х3%s", ln);
        System.out.print(rsl_3x3);
    }
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        //напишите здесь тест, проверяющий формирование доски 5 на 4.
        Board board_5x4 = new Board();
        String rsl_5x4 = board_5x4.paint(5, 4);
        String ln = System.lineSeparator();
        assertThat(rsl_5x4, is(
                String.format("X X X%s X X %sX X X%s X X %s", ln, ln, ln, ln)
                )
        );
        System.out.format("Доска 5х4%s", ln);
        System.out.print(rsl_5x4);
    }
}
