package org.example.ui.screens.inventory.left;

import org.example.ui.formatting.ColorScheme;

import javax.swing.*;
import java.awt.*;

public class ItemDisplayPanel extends JPanel {
    public ItemDisplayPanel() {
        GridLayout gridLayout = new GridLayout(3, 3);
        gridLayout.setHgap(10);
        gridLayout.setVgap(10);
        setLayout(gridLayout);
//        add(new ItemDisplayButton());
//        add(new ItemDisplayButton());
//        add(new ItemDisplayButton());
//        add(new ItemDisplayButton());
//        add(new ItemDisplayButton());
//        add(new ItemDisplayButton());
//        add(new ItemDisplayButton());
//        add(new ItemDisplayButton());
//        add(new ItemDisplayButton());
        setBackground(ColorScheme.COLOR_FOUR);
        setOpaque(false);
    }
}



