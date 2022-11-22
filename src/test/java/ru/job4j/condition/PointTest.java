package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when3dPoint1dot73() {
        double expected = 1.73;
        Point a = new Point(1, 1, 1);
        Point b = new Point(2, 0, 2);
        double dist = a.distance3d(b);
        assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when33to20then3dot16() {
        double expected = 3.16;
        Point a = new Point(3, 3);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when3dPoint1dot41() {
        double expected = 1.41;
        Point a = new Point(1, 3, 2);
        Point b = new Point(2, 4, 4);
        double dist = a.distance(b);
        assertEquals(expected, dist, 0.01);
    }
}