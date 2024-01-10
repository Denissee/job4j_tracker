package ru.job4j.tracker.action;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Output;
import ru.job4j.tracker.Tracker;

public class ShowAll implements UserAction {
    private final Output out;

    public ShowAll(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("===Show all items===");
        Item[] allFiles = tracker.findAll();
        if (allFiles.length > 0) {
            for (Item item : allFiles) {
                out.println(item);
            }
        } else {
            out.println("There are no items in storage");
        }
        return true;
    }
}


