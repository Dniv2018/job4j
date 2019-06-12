package ru.job4j.array;

        import org.junit.Test;

        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        int[] input = new int[] {100, 15, 7, 86, 0, 3, 4, 4, 0, 0, 9, 100};
        int[] is = new int[] {0, 0, 0, 3, 4, 4, 7, 9, 15, 86, 100, 100};
        BubbleSort bSort = new BubbleSort();
        int[] result = bSort.sort(input);
        assertThat(result, is(is));
    }
}