package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {64, 12, 23};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {12, 23, 64};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5elements2() {
        int[] data = new int[] {8, 2, 3, 5, 17};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 5, 8, 17};
        Assert.assertArrayEquals(expected, result);
    }
}