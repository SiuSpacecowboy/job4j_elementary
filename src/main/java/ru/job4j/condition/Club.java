package ru.job4j.condition;

public class Club {

    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("Welcome to the club buddy");
        } else {
            System.out.println("I can't.");
        }
    }

        public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
