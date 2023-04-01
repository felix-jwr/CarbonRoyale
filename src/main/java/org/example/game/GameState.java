package org.example.game;

import org.example.game.inventory.*;

public class GameState {
    private final ActiveInventory activeInventory = new ActiveInventory();
    private final PassiveInventory passiveInventory = new PassiveInventory();

    public ActiveInventory getActiveInventory() {
        return activeInventory;
    }

    public PassiveInventory getPassiveInventory() {
        return passiveInventory;
    }
}
