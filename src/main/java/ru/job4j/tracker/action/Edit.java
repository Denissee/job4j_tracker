package ru.job4j.tracker.action;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Output;
import ru.job4j.tracker.Tracker;

public class Edit implements UserAction {
    private final Output out;

    public Edit(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit Action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ===");
        int id = input.askInt("press id of item to replace: ");
        String name = input.askStr("press name of new item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Item with ID " + id + "edited");
        } else {
            out.println("Item with ID" + id + "is not edited");
        }
        return true;
    }
}

