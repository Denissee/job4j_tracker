package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student st = freshman;
        Object obj = freshman;
        Object oFresh = new Freshman();
        Freshman freshfromObj = (Freshman) oFresh;
        System.out.println(freshfromObj);
    }
}
