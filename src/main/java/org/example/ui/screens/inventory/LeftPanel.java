package org.example.ui.screens.inventory;

import javax.swing.*;

public class LeftPanel extends JPanel {
    private ItemDisplayPanel itemDisplayPanel;
    public LeftPanel(){
        itemDisplayPanel = new ItemDisplayPanel();
        add(itemDisplayPanel);
        add(new JPanel());
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

}
