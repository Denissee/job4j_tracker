package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        int result = left < right ? right : left;
        return result;
    }

    public static  int max(int left, int right, int third) {
        return max(left, max(right, third));
    }
}
