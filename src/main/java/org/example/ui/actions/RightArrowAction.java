package org.example.ui.actions;

import org.example.ui.screens.inventory.InventoryScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class RightArrowAction implements Action {
    InventoryScreen inventoryScreen;
    public RightArrowAction(InventoryScreen inventoryScreen){
        this.inventoryScreen = inventoryScreen;
    }
    @Override
    public Object getValue(String key) {
        return null;
    }

    @Override
    public void putValue(String key, Object value) {

    }

    @Override
    public void setEnabled(boolean b) {

    }

    @Override
    public boolean isEnabled() {
        return false;
    }


    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        inventoryScreen.rightArrowPressed();
    }
}
