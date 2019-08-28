package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MergeTwoArrayTest {

    @Test
    public void whenTwoVoid() {
        MergeTwoArray arrayVoid = new MergeTwoArray();
        int[] firstArray = {};
        int[] secondArray = {};
        int[] result = arrayVoid.mergeTwoArray(firstArray, secondArray);
        int[] expect = {};
        assertThat(result, is(expect));
    }

    @Test
    public void whenFistMoreSecond() {
        MergeTwoArray array = new MergeTwoArray();
        int[] firstArray = {1, 3, 4, 6, 50};
        int[] secondArray = {0, 60};
        int[] result = array.mergeTwoArray(firstArray, secondArray);
        int[] expect = {0, 1, 3, 4, 6, 50, 60};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSecondMoreFirst() {
        MergeTwoArray array = new MergeTwoArray();
        int[] firstArray = {0, 60};
        int[] secondArray = {1, 3, 4, 6, 50};
        int[] result = array.mergeTwoArray(firstArray, secondArray);
        int[] expect = {0, 1, 3, 4, 6, 50, 60};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSecondEqualFirst() {
        MergeTwoArray array = new MergeTwoArray();
        int[] firstArray = {1, 3};
        int[] secondArray = {2, 4};
        int[] result = array.mergeTwoArray(firstArray, secondArray);
        int[] expect = {1, 2, 3, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenFirstVoidSecondNotVoid() {
        MergeTwoArray array = new MergeTwoArray();
        int[] firstArray = {};
        int[] secondArray = {2, 4};
        int[] result = array.mergeTwoArray(firstArray, secondArray);
        int[] expect = {2, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenFirstNotVoidSecondVoid() {
        MergeTwoArray array = new MergeTwoArray();
        int[] firstArray = {1, 3};
        int[] secondArray = {};
        int[] result = array.mergeTwoArray(firstArray, secondArray);
        int[] expect = {1, 3};
        assertThat(result, is(expect));
    }

    @Test
    public void whenFirstAndSecondInOrder() {
        MergeTwoArray array = new MergeTwoArray();
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};
        int[] result = array.mergeTwoArray(firstArray, secondArray);
        int[] expect = {1, 2, 3, 4, 5, 6};
        assertThat(result, is(expect));
    }

}
