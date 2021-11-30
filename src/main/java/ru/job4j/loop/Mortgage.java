package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, double salary, double percent) {
        int y = 1;
        double a = amount + amount * (percent / 100);
        while (a - salary > 0) {
            a = (a - salary) + (a - salary) * (percent / 100);
            y += 1;
        }
        return y;
    }
}
