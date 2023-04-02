package org.example.ui.screens.inventory;

import org.example.game.GameState;
import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Sizing;
import org.example.ui.screens.CustomScreen;
import org.example.ui.screens.inventory.left.LeftPanel;
import org.example.ui.screens.inventory.middle.MiddlePanel;
import org.example.ui.screens.inventory.right.RightPanel;


public class InventoryScreen extends CustomScreen {
    private LeftPanel leftPanel;
    private MiddlePanel middlePanel;
    private RightPanel rightPanel;
    private int itemOffset;

    public InventoryScreen(GameState gameState) {
        super(gameState);
        itemOffset = 0;
    }
    @Override
    protected void setupScreen() {
        setLayout(null);
        setSize(Sizing.WINDOW_DIMENSION);
        leftPanel = new LeftPanel(this);
        middlePanel = new MiddlePanel();
        rightPanel = new RightPanel(gameState);
        add(leftPanel);
        add(middlePanel);
        add(rightPanel);
        setBackground(ColorScheme.COLOR_FIVE);
    }

    public void rightArrowPressed(){
        if (itemOffset + 9 < gameState.getActiveInventory().getSize()){
            itemOffset += 9;
        }
    }
}
