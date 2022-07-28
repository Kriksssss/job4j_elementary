package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {
     int a = 0;
     int b = 0;
     int c = 0;
     int x = 0;
     int expected = 0;
     int rsl = X2.calc(a, b, c, x);

    @Test
    public void whenA10B0C0X2Then40() {
        a = 10;
        b = 0;
        c = 0;
        x = 2;
        expected = 40;
        rsl = X2.calc(a, b, c, x);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X1Then3() {
        a = 1;
        b = 1;
        c = 1;
        x = 1;
        expected = 3;
        rsl = X2.calc(a, b, c, x);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        a = 0;
        b = 1;
        c = 1;
        x = 1;
        expected = 2;
        rsl = X2.calc(a, b, c, x);
        assertEquals(expected, rsl);
        }

    @Test
    public void whenA1B1C0X1Then2() {
        a = 1;
        b = 1;
        c = 0;
        x = 1;
        expected = 2;
        rsl = X2.calc(a, b, c, x);
        assertEquals(expected, rsl);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        a = 1;
        b = 1;
        c = 1;
        x = 0;
        expected = 1;
        rsl = X2.calc(a, b, c, x);
        assertEquals(expected, rsl);
    }
}
