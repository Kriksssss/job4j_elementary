package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        percent = amount * percent / 100;
        while (salary < amount + percent) {
            amount = amount + amount * percent / 100;
            amount = Math.abs(salary - amount);
            year++;
        }
        return year;
    }
}
