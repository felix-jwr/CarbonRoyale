package org.example.ui.screens.landing;

import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Fonts;

import javax.swing.*;
import java.awt.*;

public class MainMenuButton extends JButton {
        public MainMenuButton(String text) {
                setText(text);
                setBackground(ColorScheme.COLOR_THREE);
                setAlignmentX(Component.CENTER_ALIGNMENT);
                setMaximumSize( new Dimension(150, 50) );
                setFont(Fonts.MAIN_MENU_BUTTON);
                setForeground(ColorScheme.COLOR_FOUR);
        }
}
