package org.example.ui.screens.inventory.left;

import org.example.ui.screens.inventory.InventoryScreen;

import javax.swing.*;

public class LeftPanel extends JPanel {
    private final ItemDisplayPanel itemDisplayPanel;
    private final ArrowHolder arrowHolder;

    public LeftPanel(InventoryScreen inventoryScreen) {
        itemDisplayPanel = new ItemDisplayPanel();
        arrowHolder = new ArrowHolder(inventoryScreen);
        add(itemDisplayPanel);
        add(arrowHolder);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setOpaque(false);
        setBounds(0, 0, 325, 450);
    }

    public ArrowHolder getArrowHolder() {
        return arrowHolder;
    }

    public ItemDisplayPanel getItemDisplayPanel() {
        return itemDisplayPanel;
    }
}