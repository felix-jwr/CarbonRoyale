package org.example.ui.screens.inventory.left;

import org.example.ui.actions.EquipAction;
import org.example.ui.formatting.ColorScheme;

import javax.swing.*;
import java.awt.*;

public class ItemDisplayButton extends JButton {
    public ItemDisplayButton(int position, String imagePath){
        setIcon(new ImageIcon (imagePath));

        setBackground(ColorScheme.COLOR_FOUR);
        setBorder(BorderFactory.createEmptyBorder());
        setContentAreaFilled(false);
    }
}
