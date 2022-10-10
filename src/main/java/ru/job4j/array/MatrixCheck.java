package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char k = 'X';
        char t = ' ';
        for (row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board[row].length; cell++) {
                if (board[row][cell] != k && board[row][cell] != t) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
