package ru.job4j.oop;

public class Cat {

    private String name;
    private String food;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void showNick(String nick) {
        this.name = nick;
    }

    public  void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("Имя котика и что он ел: ");
        Cat gav = new Cat();
        gav.showNick("Гав");
        gav.eat("Котлета");
        gav.show();
        System.out.println("Имя котика и что он ел: ");
        Cat black = new Cat();
        black.showNick("Черныш");
        black.eat("Рыба");
        black.show();
    }
}
