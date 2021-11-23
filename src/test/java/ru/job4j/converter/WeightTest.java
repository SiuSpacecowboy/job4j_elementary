package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeightTest {

    @Test
    public void manWeight() {
        short tall = 178;
        double exp = 89.6999999;
        double real = Weight.manWeight(tall);
        double eps = 0.01;
        Assert.assertEquals(exp, real, eps);
    }

    @Test
    public void womanWeight() {
        short height = 161;
        double exp = 58.65;
        double real = Weight.womanWeight(height);
        double eps = 0.01;
        Assert.assertEquals(exp, real, eps);
    }
}

