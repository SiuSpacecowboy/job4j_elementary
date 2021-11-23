package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double diff(double first, double second) {
        return min(first, second) + div(first, second);
    }

    public static double all(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + div(first, second) + min(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Cумма сложения и умножения равна " +  sumAndMultiply(30, 20));
        System.out.println("Cумма вычитания и деления равна " +  diff(30, 20));
        System.out.println("Cумма всех операций равна " +  all(30, 20));

    }
}
