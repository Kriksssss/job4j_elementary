package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float expected1 = (float) 2.3333333;
        float out = Converter.rubleToEuro(in);
        float out1 = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("140 rubles are 2.3333333 dollar. Test result : " + passed1);
    }
}
