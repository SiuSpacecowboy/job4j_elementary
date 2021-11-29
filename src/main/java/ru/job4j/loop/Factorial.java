package ru.job4j.loop;

public class Factorial {

    @SuppressWarnings("checkstyle:InnerAssignment")
    public static int calc(int n) {
        int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
}




