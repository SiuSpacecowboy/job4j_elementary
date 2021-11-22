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
        float euro = Converter.rubleToEuro(150);
        float dollar = Converter.rubleToDollar(130);
        System.out.println("При переводе рублей мы  получили "  + euro + " евро");
        System.out.print("При переводе рублей мы получили " + dollar + " долларов");
    }
}
