package org.example.ui.actions;
import org.example.game.GameplayArea;
import org.example.ui.screens.landing.MainMenuScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class StartGameAction implements Action {
    JFrame frame;
    JPanel currentPanel;

    public StartGameAction(JFrame frame, JPanel currentPanel) {
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
        JPanel gameplayArea = new GameplayArea();
        frame.remove(currentPanel);
        frame.add(gameplayArea);
        frame.pack();
    }
}
