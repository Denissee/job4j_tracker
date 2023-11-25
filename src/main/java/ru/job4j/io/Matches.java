package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int cout = 11;
        while (cout > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + "," + "введите число от 1 до 3");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            if (matches == 1) {
                cout = cout - 1;
                System.out.println("Спичек осталось" + cout);
            } else if (matches == 2) {
                cout = cout - 2;
                System.out.println("Спичек осталось" + cout);
            } else if (matches == 3) {
                cout = cout - 1;
                System.out.println("Спичек осталось " + cout);
            } else if (matches > 0 && matches < 4) {
                System.out.println(player + "вытащил в диапазоне спичек от 1 до 3 единиц");
            } else {
                System.out.println("Ошибка. Введите допустимое значение.");
            }
            if (!turn) {
                System.out.println("Выиграл первый игрок");
            } else {
                System.out.println("Выиграл второй игрок");
            }
        }
    }
}
