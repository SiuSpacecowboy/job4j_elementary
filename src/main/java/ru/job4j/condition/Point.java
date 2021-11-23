package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double d1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return d1;
    }

    public static void main(String[] args) {
       double result =  Point.distance(0, 0, 2,  0);
       System.out.print("result from the first coordinate to the  second  is " + result);
    }
}
