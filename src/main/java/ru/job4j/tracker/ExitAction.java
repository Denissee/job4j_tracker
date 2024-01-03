package ru.job4j.tracker;

public class ExitAction implements UserAction {
    private final Output out;

    public ExitAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Завершить программу";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Завершенеи программы ===");
        return false;
    }
}






