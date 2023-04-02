package org.example.ui.screens.inventory;

import org.example.game.GameState;
import org.example.game.items.Item;
import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Sizing;
import org.example.ui.screens.CustomScreen;
import org.example.ui.screens.inventory.left.LeftPanel;
import org.example.ui.screens.inventory.middle.MiddlePanel;
import org.example.ui.screens.inventory.right.RightPanel;

import javax.swing.*;
import java.util.List;


public class InventoryScreen extends CustomScreen {
    private LeftPanel leftPanel;
    private MiddlePanel middlePanel;
    private RightPanel rightPanel;
    private int itemOffset;
    private JFrame mainWindow;

    public InventoryScreen(GameState gameState, JFrame mainWindow) {
        super(gameState);
        this.mainWindow = mainWindow;
    }

    @Override
    protected void setupScreen() {
        itemOffset = 0;
        setAttributes();
        addPanels();
    }

    private void setAttributes() {
        setLayout(null);
        setSize(Sizing.WINDOW_DIMENSION);
        setBackground(ColorScheme.COLOR_FIVE);
    }

    private void addPanels() {
        leftPanel = new LeftPanel(this);
        middlePanel = new MiddlePanel();
        rightPanel = new RightPanel();
        add(leftPanel);
        add(middlePanel);
        add(rightPanel);
    }

    public void leftArrowPressed() {
        if (0 < itemOffset) {
            itemOffset -= 9;
        }
        removeAll();
        addPanels();
        mainWindow.pack();
    }

    public void rightArrowPressed() {
        if (itemOffset + 9 < gameState.getPassiveInventory().getSize()) {
            itemOffset += 9;
        }
        removeAll();
        addPanels();
        mainWindow.pack();
    }

    public List<Item> getItemsForDisplay() {
        int arrayLength = gameState.getPassiveInventory().getSize();
        if (itemOffset + 9 <= arrayLength) {
            return gameState.getPassiveInventory().getItemList().subList(itemOffset, itemOffset + 9);
        } else {
            return gameState.getPassiveInventory().getItemList().subList(itemOffset, arrayLength);
        }
    }

    public int getItemOffset() {
        return itemOffset;
    }
}
