package ru.job4j.oop;

public class Student {
    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student bayn = new Student();
        Student sing = new Student();
        bayn.song();
        bayn.song();
        bayn.song();
        sing.song();
        sing.song();
        sing.song();
    }
}
