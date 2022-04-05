package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when3AndMinus2ToMinus4And0Then7dot28() {
        double expected = 7.28;
        Point a = new Point(3, -2);
        Point b = new Point(-4, 0);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when7And6to9And9then3dot6() {
        double expected = 3.6;
        Point a = new Point(7, 6);
        Point b = new Point(9, 9);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3AndMinus3ToMinus4And6Then11dot4() {
        double expected = 11.4;
        Point a = new Point(3, -3);
        Point b = new Point(-4, 6);
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }
}