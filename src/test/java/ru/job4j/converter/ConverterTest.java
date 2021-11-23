package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float exp = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(exp, out, eps);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in1 = 180;
        float exp1 = 3;
        float out1 = Converter.rubleToDollar(in1);
        float eps = 0.0001f;
        Assert.assertEquals(exp1, out1, eps);
    }
}