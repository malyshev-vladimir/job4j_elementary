package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when3AndMinus2ToMinus4And0Then7dot28() {
        double expected = 7.28;
        int x1 = 3;
        int y1 = -2;
        int x2 = -4;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when7And6to9And9then3dot6() {
        double expected = 3.6;
        int x1 = 7;
        int y1 = 6;
        int x2 = 9;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3AndMinus3ToMinus4And6Then11dot4() {
        double expected = 11.4;
        int x1 = 3;
        int y1 = -3;
        int x2 = -4;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}