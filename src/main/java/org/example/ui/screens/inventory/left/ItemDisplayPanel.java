package org.example.ui.screens.inventory.left;

import org.example.game.items.Item;
import org.example.ui.actions.EquipAction;
import org.example.ui.formatting.ColorScheme;
import org.example.ui.screens.inventory.InventoryScreen;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ItemDisplayPanel extends JPanel {
    public ItemDisplayPanel(InventoryScreen inventoryScreen) {
        List<Item> itemsForDisplay = inventoryScreen.getItemsForDisplay();

        GridLayout gridLayout = new GridLayout(3, 3);
        gridLayout.setHgap(10);
        gridLayout.setVgap(10);
        setLayout(gridLayout);

        for (int i = 0; i < itemsForDisplay.size(); i++) {
            ItemDisplayButton itemDisplayButton = new ItemDisplayButton(inventoryScreen.getItemOffset() + i,
                    itemsForDisplay.get(i).getImagePath());

            itemDisplayButton.addActionListener(new EquipAction(i, inventoryScreen));
            itemDisplayButton.setBorder(BorderFactory.createEmptyBorder());
            itemDisplayButton.setContentAreaFilled(false);

            add(itemDisplayButton);
        }
        for (int i = 0; i < 9 - itemsForDisplay.size(); i++) {
            add(new ItemDisplayButton(-1,null));
        }
        setBackground(ColorScheme.COLOR_FOUR);
        setOpaque(false);
    }
}



