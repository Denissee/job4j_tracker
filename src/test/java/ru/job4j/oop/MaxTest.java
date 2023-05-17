package ru.job4j.oop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class MaxTest {
    @Test
    public void compare() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int exp = 2;
        Assert.assertEquals(result, exp);
    }
}