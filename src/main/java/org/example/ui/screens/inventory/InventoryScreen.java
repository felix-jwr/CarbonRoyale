package org.example.ui.screens.inventory;

import org.example.game.GameState;
import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Sizing;
import org.example.ui.screens.CustomScreen;

public class InventoryScreen extends CustomScreen {
    public InventoryScreen(GameState gameState) {
        super(gameState);
    }

    @Override
    protected void setupScreen() {
        setBackground(ColorScheme.COLOR_FIVE);
        setSize(Sizing.WINDOW_DIMENSION);
    }

}
