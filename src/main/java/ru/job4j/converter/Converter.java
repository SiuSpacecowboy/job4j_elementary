package ru.job4j.converter;

public class Converter {
    public static float  rubleToEuro(float value) {
        float y = value / 70;
        return y;
    }

    public static float rubleToDollar(float value) {
        float y = value / 60;
        return y;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        float in1 = 120;
        float expected1 = 2;
        float out1 = Converter.rubleToDollar(in1);
        boolean right = expected1 == out1;
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        System.out.print("120 rubles are 2 dollars. Test result : " + right);
    }
}
