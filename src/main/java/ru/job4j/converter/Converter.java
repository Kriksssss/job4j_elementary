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
        float in1 = 180;
        float expected = 2;
        float expectedDoll = 3;
        float out = Converter.rubleToEuro(in);
        float doll = Converter.rubleToDollar(in1);
        boolean passed = expected == out;
        boolean passed1 = expectedDoll == doll;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("140 rubles are 3 dollar. Test result : " + passed1);
    }
}
