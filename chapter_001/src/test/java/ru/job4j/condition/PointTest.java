package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void aDistToB() {
        Point first = new Point(0,1);
        Point second = new Point (2,5);
        assertThat(first.distanceTo(second), is(4.47213595499958));
    }
}
