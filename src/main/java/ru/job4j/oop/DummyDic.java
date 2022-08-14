package ru.job4j.oop;

public class DummyDic {

    public String engToRus() {
        String eng = "Бесконечность";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String talk = word.engToRus();
        System.out.println("Неизвестное слово " + talk);
    }
}
