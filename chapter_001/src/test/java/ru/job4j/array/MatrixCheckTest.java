package ru.job4j.array;

        import org.junit.Test;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

/**
 * Класс для проверки заполнености квадратного массива по диагоналям true/false.
 */

public class MatrixCheckTest {

    /**
     * Проверка нечетного массива когда обе диагонали состоят из одинаковых значений
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, true},
                {false, true, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }


    /**
     * Проверка нечетного массива когда обе диагонали не состоят из одинаковых значений.
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false},
                {false, false, true},
                {true, false, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Проверка четного массива когда нисходящая диагональ состоит из одних значений
     * и восходящая диагональ состоит из одинаковых значений
     */
    @Test
    public void whenDataNotMonoByTrueThenTrueOdd() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false, false},
                {true, true, false, true},
                {false, false, true, false},
                {false, false, true, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }


    /**
     * Проверка четного массива когда нисходящая диагональ состоит из разных значений
     * и восходящая диагональ состоит из разных значений
     */
    @Test
    public void whenDataNotMonoByTrueThenFalseOdd() {
        MatrixCheck check = new MatrixCheck();
        boolean[][] input = new boolean[][] {
                {true, true, false, false},
                {true, false, false, true},
                {false, true, true, false},
                {false, false, true, true}
        };
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}