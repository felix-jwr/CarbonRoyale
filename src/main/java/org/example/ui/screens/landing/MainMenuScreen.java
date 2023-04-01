package org.example.ui.screens.landing;

import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Sizing;

import javax.swing.*;

public class MainMenuScreen extends JPanel {
    public MainMenuScreen() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(Sizing.WINDOW_DIMENSION);
        setBackground(ColorScheme.COLOR_FIVE);
    }
}