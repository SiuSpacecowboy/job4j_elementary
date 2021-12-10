package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        String[] ex3 = new String[4];
        ex3[0] = "Try";
        ex3[1] = "Try1";
        ex3[2] = "Try2";
        ex3[3] = "Try3";
        System.out.println(ex3[0]);
        System.out.println(ex3[1]);
        System.out.println(ex3[2]);
        System.out.println(ex3[3]);

    }
}
