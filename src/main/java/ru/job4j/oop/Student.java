package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("Tra Tra Tra");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        Student bayn = new Student();
        Student sing = new Student();
        petya.music();
        bayn.song();
        bayn.song();
        bayn.song();
        sing.song();
        sing.song();
        sing.song();
    }
}

