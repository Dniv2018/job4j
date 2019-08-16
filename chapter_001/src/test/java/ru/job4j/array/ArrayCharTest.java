package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {

    /**
    * Если префикс есть в слове
    */
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "He");
        assertThat(result, is(true));
    }

    /**
     * Если префикса нет в слове
     */
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hello", "Hi");
        assertThat(result, is(false));
    }

    /**
     * Если префикс больше слова
     */
    @Test
    public void whenStartWithPrefixMoreWord() {
        ArrayChar word = new ArrayChar();
        boolean result = word.startsWith("Hi", "Hig");
        assertThat(result, is(false));
    }
}