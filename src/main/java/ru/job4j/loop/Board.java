package ru.job4j.loop;

public class Board {
    public static void paint(int height, int width) {
        for (int row = 0; row < height; row++) {
            for (int ln = 0; ln < width; ln++) {
                if ((ln + row) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}

