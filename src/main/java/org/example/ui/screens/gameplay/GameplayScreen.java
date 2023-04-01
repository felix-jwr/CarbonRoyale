package org.example.ui.screens.gameplay;

import org.example.game.GameState;
import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Sizing;
import org.example.ui.screens.CustomScreen;

public class GameplayScreen extends CustomScreen {
    public GameplayScreen(GameState gameState) {
        super(gameState);
    }

    @Override
    protected void setupScreen() {
        setSize(Sizing.WINDOW_DIMENSION);
        setBackground(ColorScheme.COLOR_THREE);
    }
}
