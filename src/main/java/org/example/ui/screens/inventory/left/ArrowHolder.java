package org.example.ui.screens.inventory.left;

import org.example.ui.actions.LeftArrowAction;
import org.example.ui.actions.RightArrowAction;
import org.example.ui.screens.inventory.InventoryScreen;

import javax.swing.*;

public class ArrowHolder extends JPanel {
    private final ArrowButton leftArrow, rightArrow;

    public ArrowHolder(InventoryScreen inventoryScreen) {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        leftArrow = new ArrowButton("src/resources/arrow_left.png");
        rightArrow = new ArrowButton("src/resources/arrow_right.png");
        leftArrow.addActionListener(new LeftArrowAction(inventoryScreen));
        rightArrow.addActionListener(new RightArrowAction(inventoryScreen));
        add(leftArrow);
        add(rightArrow);
        setOpaque(false);
    }
}
