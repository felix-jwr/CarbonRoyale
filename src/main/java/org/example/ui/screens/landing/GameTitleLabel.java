package org.example.ui.screens.landing;

import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Fonts;

import javax.swing.*;
import java.awt.*;

public class GameTitleLabel extends JLabel {
    public GameTitleLabel(){
        setSize(300, 150);
        setText("Carbon Royale");
        setFont(Fonts.GAME_TITLE);
        setForeground(ColorScheme.COLOR_FOUR);
        setAlignmentX(Component.CENTER_ALIGNMENT);
    }
}
