package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Будет ли на следующей неделе банкет?");
        int answer = new Random().nextInt(3);
        String mes = switch (answer) {
            case 1 -> "Да";
            case 2 -> "Нет";
            default -> "Возможно";
        };
        System.out.println(mes);
    }
}
