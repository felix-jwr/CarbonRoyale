package org.example.ui.screens.inventory;

import org.example.game.GameState;
import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Sizing;
import org.example.ui.screens.CustomScreen;

import javax.swing.*;
import java.awt.*;

public class InventoryScreen extends CustomScreen {
    private LeftPanel leftPanel;
    private MiddlePanel middlePanel;
    private RightPanel rightPanel;

    public InventoryScreen(GameState gameState) {
        super(gameState);

    }

    @Override
    protected void setupScreen() {
        setLayout(new GridLayout(1, 3));
        leftPanel = new LeftPanel();
        middlePanel = new MiddlePanel();
        rightPanel = new RightPanel();
        add(leftPanel);
        add(middlePanel);
        add(rightPanel);
        setSize(Sizing.WINDOW_DIMENSION);
        setBackground(ColorScheme.COLOR_FIVE);
    }
}
