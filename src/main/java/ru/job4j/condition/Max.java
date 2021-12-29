package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int left, int right, int third) {
        int result = max(left, right) >= third ? max(left, right) : third;
        return result;
    }

    public static int max(int left, int right, int third, int four) {
        int result = max(left, right, third) >= four ? max(left, right, third) : four;
        return result;
    }

    public static void main(String[] args) {
        int numb = max(7, 8);
        System.out.println("Максимальное число " + numb);
    }
}
