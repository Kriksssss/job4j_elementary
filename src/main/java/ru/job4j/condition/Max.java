package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int left, int right, int k) {
        return max(max(left, right), k);
    }

    public static int max(int left, int right, int k, int j) {
        return max(max(left, right, k), j);
    }
}
