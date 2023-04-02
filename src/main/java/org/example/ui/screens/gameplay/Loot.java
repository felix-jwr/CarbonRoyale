package org.example.ui.screens.gameplay;

import org.example.game.GameState;
import org.example.ui.actions.InventoryAction;
import org.example.ui.actions.QuitGameAction;
import org.example.ui.actions.StartGameAction;
import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Fonts;
import org.example.ui.formatting.Sizing;
import org.example.ui.screens.CustomScreen;
import org.example.ui.screens.landing.GameTitleLabel;
import org.example.ui.screens.landing.MainMenuButton;

import javax.swing.*;
import java.awt.*;

public class Loot extends CustomScreen {
    public Loot(GameState gameState){
        super(gameState);
    }

    @Override
    protected void setupScreen() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setSize(Sizing.WINDOW_DIMENSION);
        setBackground(ColorScheme.COLOR_FIVE);
    }
}
