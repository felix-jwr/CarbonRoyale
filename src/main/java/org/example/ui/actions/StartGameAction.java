package org.example.ui.actions;

import org.example.ui.screens.CustomScreen;
import org.example.ui.screens.gameplay.GameplayScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class StartGameAction implements Action {
    JFrame frame;
    CustomScreen currentPanel;

    public StartGameAction(JFrame frame, CustomScreen currentPanel) {
        this.frame = frame;
        this.currentPanel = currentPanel;
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
        return true;
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {

    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Render Gameplay Area
        GameplayScreen gameplayScreen = new GameplayScreen(currentPanel.getGameState());
        frame.remove(currentPanel);
        frame.add(gameplayScreen);
        frame.pack();
    }
}
