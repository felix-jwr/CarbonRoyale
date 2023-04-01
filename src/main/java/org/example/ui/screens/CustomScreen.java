package org.example.ui.screens;

import org.example.game.GameState;

import javax.swing.*;

public abstract class CustomScreen extends JPanel {
    private final GameState gameState;
    public CustomScreen(GameState gameState){
        this.gameState = gameState;
        setupScreen();
    }

    abstract protected void setupScreen();

    public GameState getGameState() {
        return gameState;
    }
}
