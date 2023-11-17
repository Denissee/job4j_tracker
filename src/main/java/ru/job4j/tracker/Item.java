package ru.job4j.tracker;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class Item {

    private int id;

    private String name;

    private static LocalDateTime created = LocalDateTime.now();

    public int getId() {
        return id;
    }

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public static LocalDateTime getCreated() {
        return created;
    }

    public Item(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Item first = new Item();
    }
}





