package org.example.ui.screens.landing;

import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Fonts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainMenuButton extends JButton {
        public MainMenuButton(String text, Action action) {
                setAction(action);
                setText(text);
                setBackground(ColorScheme.COLOR_THREE);
                setAlignmentX(Component.CENTER_ALIGNMENT);
                setMaximumSize( new Dimension(150, 50) );
                setFont(Fonts.MAIN_MENU_BUTTON);
                setForeground(ColorScheme.COLOR_FOUR);
        }
}
