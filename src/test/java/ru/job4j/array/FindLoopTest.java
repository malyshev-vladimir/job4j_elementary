package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {5, 4, 3, 2};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = {6, 2, 6, 8, 9, 3, 23, 12, 11, 0, 1};
        int el = 8;
        int start = 5;
        int finish = 8;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas9Then4() {
        int[] data = {6, 2, 6, 8, 9, 3, 23, 12, 11, 0, 1};
        int el = 9;
        int start = 2;
        int finish = 6;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}