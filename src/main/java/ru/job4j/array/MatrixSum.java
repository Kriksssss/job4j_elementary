package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int t = 0; t < array[i].length; t++) {
                rsl += array[i][t];
            }
        }
        return rsl;
    }
}
