package org.example.game;

import org.example.game.inventory.*;

public class GameState {
    private final ActiveInventory activeInventory = new ActiveInventory();
    private final PassiveInventory passiveInventory = new PassiveInventory();
    private Leaf leaves = new Leaf(0);

    public ActiveInventory getActiveInventory() {
        return activeInventory;
    }

    public PassiveInventory getPassiveInventory() {
        return passiveInventory;
    }

    public int getLeafCount() {
        return leaves.getLeaves();
    }

    public void addLeaves(int count) {
        this.leaves.addLeaves(count);
    }
}
