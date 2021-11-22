package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x3 = x2 - x1;
        double y3 = y2 - y1;
        double x4 = Math.pow(x3, 2);
        double y4 = Math.pow(y3, 2);
        double d1 = x4 +  y4;
        double d2 = Math.sqrt(d1);
        return d2;
    }

    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public static void main(String[] args) {
       double result =  Point.distance(32, 11, 54,  10);
       System.out.print("result from the first coordinate to the  second  is " + result);
    }
}
