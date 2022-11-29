package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxOverloadTest {

    @Test
    public void whenGiven30and50theResultIs50() {
        int left = 40;
        int right = 50;
        int expected = 50;
        assertThat(MaxOverload.max(left, right)).isEqualTo(expected);
    }

    @Test
    public void whenGiven5and18and24theResultIs24() {
        int one = 5;
        int two = 24;
        int three = 18;
        int expected = 24;
        assertThat(MaxOverload.max(one, two, three)).isEqualTo(expected);
    }

    @Test
    public void whenGiven10and10and7and35theResultIs35() {
        int one = 10;
        int two = 10;
        int three = 7;
        int four = 35;
        int expected = 35;
        assertThat(MaxOverload.max(one, two, three, four)).isEqualTo(expected);
    }
}