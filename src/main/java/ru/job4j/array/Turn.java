package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[array.length - 1 - i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }
        return array;
    }
}
