package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whendoesntExist() {
        double ab = 12;
        double ac = 13;
        double bc = 1;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}