package ru.job4j.array;

        import org.junit.Test;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

public class CheckTest {

    /**
     * Проверка нечетного boolean-массива в котором все элементы true
     */
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Проверка нечетного boolean-массива в котором невсе элементы true
     */
    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Проверка нечетного boolean-массива в котором все элементы false
     */
    @Test
    public void whenDataMonoByFalseThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Проверка четного boolean-массива в котором невсе элементы false
     */
    @Test
    public void whenDataNotMonoByTrueThenFalseAndOdd() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, true, false};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    /**
     * Проверка четного boolean-массива в котором невсе элементы true
     */
    @Test
    public void whenDataMonoByTrueThenTrueAndOdd() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    /**
     * Проверка четного boolean-массива в котором все элементы false
     */
    @Test
    public void whenDataMonoByFalseThenTrueAndOdd() {
        Check check = new Check();
        boolean[] input = new boolean[] {false, false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
}