package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programLang;

    public Programmer(String programLang, int experiance, boolean degree) {
        super(experiance, degree);
       this.programLang = programLang;
    }
}
