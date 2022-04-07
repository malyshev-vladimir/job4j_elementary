package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax1to2then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax5to4then5() {
        int first = 5;
        int second = 4;
        int result = Max.max(first, second);
        int expected = 5;
        assertEquals(result, expected);
    }

    @Test
    public void when7and2and4then7() {
        int first = 7;
        int second = 2;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertEquals(result, expected);
    }

    @Test
    public void when13and14and8and11then14() {
        int first = 13;
        int second = 14;
        int third = 8;
        int fourth = 11;
        int result = Max.max(first, second, third, fourth);
        int expected = 14;
        assertEquals(result, expected);
    }
}