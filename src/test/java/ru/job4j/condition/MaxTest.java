package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7to2Then7() {
        int left = 7;
        int right = 2;
        int result = Max.max(left, right);
        int exp = 7;
        Assert.assertEquals(exp, result);
    }

    @Test
    public void whenMax3to5Then5() {
        int left = 3;
        int right = 5;
        int result = Max.max(left, right);
        int exp = 5;
        Assert.assertEquals(exp, result);
    }

    @Test
    public void whenMax8to8Then8() {
        int left = 8;
        int right = 8;
        int result = Max.max(left, right);
        int exp = 8;
        Assert.assertEquals(exp, result);
    }
}