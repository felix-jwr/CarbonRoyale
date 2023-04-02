package org.example.ui.screens.landing;

import org.example.game.GameState;
import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Sizing;
import org.example.ui.screens.CustomScreen;

import javax.swing.*;

public class MainMenuScreen extends CustomScreen {
    public MainMenuScreen(GameState gameState) {
        super(gameState);
    }

    @Override
    protected void setupScreen() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(Sizing.WINDOW_DIMENSION);
        setBackground(ColorScheme.COLOR_FIVE);
    }
}