package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To6To1Then6() {
        int left = 3;
        int right = 6;
        int k = 1;
        int result = Max.max(left, right, k);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax6To6To10To20Then20() {
        int left = 6;
        int right = 6;
        int k = 10;
        int x = 20;
        int result = Max.max(left, right, k, x);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }
}