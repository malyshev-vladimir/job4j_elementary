package ru.job4j.condition;

import static org.junit.Assert.*;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP8K3Square3() {
        double expected = 3;
        int p = 8;
        double k = 3;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenP14K7Square5dot359() {
        double expected = 5.359;
        int p = 14;
        double k = 7;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}