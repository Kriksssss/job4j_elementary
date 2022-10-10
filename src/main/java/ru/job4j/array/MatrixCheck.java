package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char k = 'X';
        char t = ' ';
        for (int i = 0; i < board.length; i++) {
            for (int cell = 0; cell < board[i].length; cell++) {
                if (board[row][i] != k || board[i][cell] != t && board[i][cell] != k) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
