package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when00to20then1() {
        int expected = 1;
        Point c = new Point(0, 1, 0);
        Point d = new Point(0, 0, 0);
        double dist = c.distance(d);
        Assert.assertEquals(expected, dist, 0.01);
    }
}
