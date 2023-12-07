package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Маршрут перестроен.");
    }

    @Override
    public void pass(String num) {
        System.out.println("Количество пассажиров состовляет " + num);
    }

    @Override
    public int fill(int liters) {
        int price = 5;
        return price * liters;
    }
}
