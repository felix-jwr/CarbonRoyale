package org.example.ui.screens.inventory.left;

import org.example.ui.formatting.ColorScheme;

import javax.swing.*;
import java.awt.*;

public class ItemDisplayButton extends JButton {
    public ItemDisplayButton(int position, ImageIcon imageIcon){
        if (imageIcon != null) {
            setIcon(imageIcon);
        }
        setBackground(ColorScheme.COLOR_FOUR);
        setBorder(BorderFactory.createEmptyBorder());
    }
}
