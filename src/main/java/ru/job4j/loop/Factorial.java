package ru.job4j.loop;

public class Factorial {

    @SuppressWarnings("checkstyle:InnerAssignment")
    public static int calc(int n) {
        int result = 1;
        if (n > 0) {
            for (int a = 1; a <= n; a++) {
                result = result * a;
            }
        } else {
            result = 1;
            return result;
        }
        return result;
        }
    }

