package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    void when52To34Then2dot82() {
        Point a = new Point(5, 2);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        double expected = 2.82;
        assertThat(out).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void when00to07then7() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 7);
        double expected = 7;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void when10to50then6() {
        Point a = new Point(-1, 0);
        Point b = new Point(5, 0);
        double expected = 6;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void when20to08then8dot24() {
        Point a = new Point(2, 0);
        Point b = new Point(0, 8);
        double expected = 8.24;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void when30to50then2() {
        Point a = new Point(3, 0);
        Point b = new Point(5, 0);
        double expected = 2;
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void when220to524then5() {
        Point a = new Point(2, 2, 0);
        Point b = new Point(5, 2, 4);
        double expected = 5;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void when304to251then5dot916() {
        Point a = new Point(3, 0, 4);
        Point b = new Point(2, 5, 1);
        double expected = 5.916;
        double out = a.distance3d(b);
        assertThat(out).isEqualTo(expected, offset(0.01));
    }
}