package org.example.game.inventory;

import org.example.game.items.Item;

import java.util.ArrayList;

public class Inventory {
    private final ArrayList<Item> itemList;

    public Inventory() {
        itemList = new ArrayList<>();
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public Item popItem(int itemIndex) {
        return itemList.remove(itemIndex);
    }
}
