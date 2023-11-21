package ru.job4j.tracker;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class Item {

    private int id;

    private String name;

    private static LocalDateTime created = LocalDateTime.now();

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

    public int getId() {
        return id;
    }

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public static LocalDateTime getCreated() {
        return created;
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

    @Override
    public String toString() {
        return "Item{" +
                 "id=" + id
                + ", name='" + name + '\''
                + ", created=" + created.format(FORMATTER)
                + '}';
    }
}





