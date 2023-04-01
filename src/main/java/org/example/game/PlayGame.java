package org.example.game;

import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Sizing;

import java.awt.EventQueue;
import javax.swing.*;

public class PlayGame extends JFrame {

    public PlayGame() {
        initUI();
    }

    private void initUI() {
        add(new GameplayArea());

        setSize(Sizing.WINDOW_DIMENSION);
        setBackground(ColorScheme.COLOR_FOUR);

        setTitle("Carbon Royale");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            PlayGame playGame = new PlayGame();
            playGame.setVisible(true);
        });
    }
}
