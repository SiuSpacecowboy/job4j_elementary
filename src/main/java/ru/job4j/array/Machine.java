package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int idk = money - price;
        for (int i = 0; i < rsl.length; i++) {
            while (idk != 0) {
                for (int j = 0; j < coins.length; j++) {
                    if (idk - 10 >= 0) {
                        idk -= 10;
                        rsl[i] = coins[j];
                        break;
                    } else if (idk - 5 >= 0) {
                        idk -= 5;
                        rsl[i] = coins[j + 1];
                        break;
                    } else if (idk - 2 >= 0) {
                        idk -= 2;
                        rsl[i] = coins[j + 2];
                        break;
                    } else {
                        idk -= 1;
                        rsl[i] = coins[j + 3];
                        break;
                    }
                }
                break;
            }
            while (rsl[i] != 0) {
                size++;
                break;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}

