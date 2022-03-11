package ru.job4j.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan172Then82dot8() {
        short in = 172;
        double expected = 82.8;
        double out = Fit.manWeight(in);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman172Then71dot3() {
        short in = 172;
        double expected = 71.3;
        double out = Fit.womanWeight(in);
        assertEquals(expected, out, 0.01);
    }
}