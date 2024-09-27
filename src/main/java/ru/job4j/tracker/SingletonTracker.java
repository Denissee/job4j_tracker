package ru.job4j.tracker;

public final class SingletonTracker {
    private  Tracker tracker = new Tracker();
    private static SingletonTracker instance = null;

    private SingletonTracker() {
    }

    public static SingletonTracker getInstance() {
        if (instance == null) {
            instance = new SingletonTracker();
        }
        return instance;

    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}
