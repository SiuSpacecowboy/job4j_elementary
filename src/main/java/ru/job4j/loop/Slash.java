package ru.job4j.loop;

public class Slash {

    public static void draw(int size) {
        if (size % 2 == 0) {
            for (int j = 0; j <= size; j++) {
                for (int i = 0; i <= size; i++) {
                    if (i + j == 2 * i || i + j == size || i + j == 0) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            for (int j = 0; j <= size; j++) {
                for (int i = 0; i <= size; i++) {
                    if ((i + j == 2 * i && i < size) || i + j == size - 1 || i + j == 0) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

        public static void main(String[] args) {
            draw(5);
        }
    }

