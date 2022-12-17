package ru.job4j.ex;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactTest {

    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Fact.calc(-4);
                });

    }

    @Test
    public void when4fakt24() {
        int num = 4;
        int expected = 24;
        int result = Fact.calc(num);
        assertThat(result).isEqualTo(expected);
    }
}