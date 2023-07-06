package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
            return items;
    }

    public Item[] findByName(String key) {
        int k = 0;
        Item[] rsl = new Item[100];
        for (int index = 0; index < size; index++) {
            if (items[index].getName().equals(key)) {
                rsl[k++] = items[index];
            }
        }
        return Arrays.copyOf(rsl, k);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = items[index];
                break;
            }
        }
        return rsl;
    }
}