package ru.job4j.converter;

public class Weight {
    public static double manWeight(short tall) {
        double pmw = (tall - 100) * 1.15;
        return pmw;
    }

    public static double womanWeight(short height) {
        double pww = (height - 110) * 1.15;
        return pww;
    }

    public static void main(String[] args) {
        short tall = 178;
        short height = 161;
        double man = Weight.manWeight(tall);
        double woman = Weight.womanWeight(height);
        System.out.println("Man weight is " + man);
        System.out.println("Woman weight is " + woman);
    }
}