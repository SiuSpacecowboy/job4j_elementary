package ru.job4j.array;

import ru.job4j.MathFunc;

public class Square {

    public static int[] calculate(int bound) {
        int[] sol = new int[bound];
        for (int i = 0; i < bound; i++) {
            sol[i] = (int) Math.pow(i, 2);
        }
        return sol;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
