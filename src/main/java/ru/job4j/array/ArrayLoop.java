package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {
        int[] defend = new int[5];
        for (int index = 0; index < defend.length; index++) {
            defend[index] =  index * 2 + 3;
        }
        for (int index = 0; index < defend.length; index++) {
            System.out.println(defend[index]);
        }
    }
}
