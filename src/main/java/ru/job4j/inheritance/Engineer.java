package ru.job4j.inheritance;

public class Engineer extends Profession {
    private int experiance;

    public Engineer(int experiance, boolean degree) {
        super(degree);
        this.experiance = experiance;
    }
}
