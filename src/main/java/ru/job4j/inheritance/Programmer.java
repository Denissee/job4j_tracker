package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programLand;

    public Programmer(String programLand, int experiance, boolean degree) {
        super(experiance, degree);
        this.programLand = programLand;
    }
}
