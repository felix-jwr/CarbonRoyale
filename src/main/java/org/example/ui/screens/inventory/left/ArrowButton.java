package org.example.ui.screens.inventory.left;

import javax.swing.*;

public class ArrowButton extends JButton {
    public ArrowButton(String pathname) {
        setIcon(new ImageIcon(pathname));
        setBorder(BorderFactory.createEmptyBorder());
        setContentAreaFilled(false);
    }
}