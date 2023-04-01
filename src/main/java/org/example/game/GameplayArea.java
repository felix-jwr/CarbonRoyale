package org.example.game;

import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Sizing;

import javax.swing.*;

public class GameplayArea extends JPanel {
    public GameplayArea() {
        setSize(Sizing.WINDOW_DIMENSION);
        setBackground(ColorScheme.COLOR_THREE);
    }
}
