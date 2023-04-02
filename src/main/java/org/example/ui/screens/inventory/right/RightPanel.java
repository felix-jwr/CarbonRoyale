package org.example.ui.screens.inventory.right;

import org.example.Main;
import org.example.game.GameState;
import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Fonts;
import org.example.ui.screens.landing.MainMenuButton;

import javax.swing.*;
import java.awt.*;

public class RightPanel  extends JPanel {
    public RightPanel(GameState gameState) {
        setBackground(ColorScheme.COLOR_FOUR);
        setBounds(575, 0, 300, 450);

        setupLeafCounter(gameState);
        }

    public void setupLeafCounter(GameState gameState) {
        int leafCount = gameState.getLeafCount();
        String message = "Leaf Count: " + String.valueOf(leafCount);
        JLabel leafCountDisplay = new JLabel(message);
        leafCountDisplay.setFont(new Font(Font.DIALOG,  Font.PLAIN, 15));
        leafCountDisplay.setForeground(ColorScheme.COLOR_FIVE);
        leafCountDisplay.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(leafCountDisplay);
    }
}
