package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public String go() {
        return null;
    }

    @Override
    public int pass(String num) {
        return 0;
    }

    @Override
    public int fill(int liters) {
        int price = 5;
        return price * liters;
    }
}
