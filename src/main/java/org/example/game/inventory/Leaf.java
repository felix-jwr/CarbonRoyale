package org.example.game.inventory;

public class Leaf {
    private int count = 0;

    public Leaf(int count) {
        this.count = count;
    }

    public void addLeaves(int count) {
        this.count += count;
    }

    public int getLeaves() {
        return this.count;
    }
}
