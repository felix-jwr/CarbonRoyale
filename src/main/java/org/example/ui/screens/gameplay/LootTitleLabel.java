package org.example.ui.screens.gameplay;

import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Fonts;

import javax.swing.*;
import java.awt.*;

public class LootTitleLabel extends JLabel {
    public LootTitleLabel() {
        setSize(300, 150);
        setText("Loot Get :)!");
        setFont(Fonts.GAME_TITLE);
        setForeground(ColorScheme.COLOR_FOUR);
        setAlignmentX(Component.CENTER_ALIGNMENT);
    }
}
