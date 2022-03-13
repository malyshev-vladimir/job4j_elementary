package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax1to2then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax5to4then5() {
        int left = 5;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 5;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax3to3then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertEquals(result, expected);
    }
}