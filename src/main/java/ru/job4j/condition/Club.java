package ru.job4j.condition;

public class Club {
        public static void permission(boolean hasMoney, boolean beFriend) {
            String permission = hasMoney || beFriend ? "I can go to the club." : "I can't.";
            System.out.println(permission);
    }

        public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}


