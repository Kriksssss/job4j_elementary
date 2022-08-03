package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        System.out.println(Triangle.exist(10, 11, 12));
        System.out.println(Triangle.exist(33, 11, 12));
    }
}
