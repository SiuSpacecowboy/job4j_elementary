package ru.job4j.condition;

public class ChessBoard {

    @SuppressWarnings("checkstyle:ParenPad")
    public static int way(int x1, int y1, int x2, int y2) {
        if (x1 != x2 && y1 != y2 && Math.abs(x2 - x1) == Math.abs(y2 - y1) && x1 < 8 && x2 < 8 && y1 < 8 && y2 < 8 && 0 <= x1  && 0 <= x2 && 0 <= y1 && 0 <= y2) {
            int rsl = Math.abs(x2 - x1);
            return rsl;
        } else {
        return 0;
        }
    }
}