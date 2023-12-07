package ru.job4j.cast;

public class All {
    public static void main(String[] args) {
        Vehicle fly = new Fly();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicle = new Vehicle[]{fly, train, bus};
        for (Vehicle way : vehicle) {
            way.move();
        }
    }
}
