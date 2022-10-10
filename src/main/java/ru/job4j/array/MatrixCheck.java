package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char k = 'X';
        for (int i = 0; i < board.length; i++) {
                if (board[row][i] != k) {
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        char k = 'X';
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != k) {
                result = false;
                break;
            }
        }
        return result;
    }
}