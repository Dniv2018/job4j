package ru.job4j.tracker.oop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenZeroAndTenThenTen() {
        Point pointFirst = new Point(0, 0);
        Point pointSecond = new Point(0, 10);
       // Point point = new Point();
        double result = pointFirst.distance(pointSecond);
        assertThat(result, is(10D));
    }

    @Test
    public void whenZeroAndTenThenTen3D() {
        Point pointFirst = new Point(0, 0, 0);
        Point pointSecond = new Point(0, 10, 0);
        // Point point = new Point();
        double result = pointFirst.distance3d(pointSecond);
        assertThat(result, is(10D));
    }
}
