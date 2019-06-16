package ru.job4j.array;

        import org.junit.Test;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    /**
     * Проверка удаления дубликатов в массиве методом remove класса ArrayDuplicate
     */
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate array = new ArrayDuplicate();
        String[] input = new String[] {"0", "1", "0", "0", "2", "0", "2", "3", "0"};
        String[] result = array.remove(input);
        String[] expect = new String[] {"0", "1", "2", "3"};
        assertThat(result, is(expect));
        //assertThat(result, Matchers.is(expect));//напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
    }
}