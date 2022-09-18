package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            int lastIndex = array[array.length - 1];
            int currentIndex = array[index];
            result[currentIndex - 1] = array[lastIndex - index - 1];
        }
        return result;
    }
}
