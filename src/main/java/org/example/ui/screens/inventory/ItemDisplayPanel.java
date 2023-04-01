package org.example.ui.screens.inventory;

import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Sizing;

import javax.swing.*;
import java.awt.*;

public class ItemDisplayPanel extends JPanel {
    public ItemDisplayPanel() {
        Dimension maximumSize = new Dimension(Sizing.WINDOW_WIDTH / 2, Sizing.WINDOW_DIMENSION.height);
        setMaximumSize(maximumSize);
        setBackground(ColorScheme.COLOR_FOUR);
    }
}



