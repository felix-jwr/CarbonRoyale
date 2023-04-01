package org.example.ui.actions;
import org.example.game.PlayGame;
import org.example.ui.screens.CustomScreen;
import org.example.ui.screens.gameplay.GameplayScreen;

import javax.swing.*;
import java.awt.*;
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
        // Get rid of current frame
        frame.dispose();

        // Set up gameplay frame
        EventQueue.invokeLater(() -> {
            PlayGame movePlayerSprite = new PlayGame();
            movePlayerSprite.setVisible(true);
        });
    }
}
