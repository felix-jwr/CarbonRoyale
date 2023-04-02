package org.example.game;

import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Sizing;
import org.example.ui.screens.gameplay.GameplayArea;

import javax.swing.*;

public class PlayGame extends JFrame {

    public PlayGame(GameState gameState) {
        initGame(gameState);
    }

    private void initGame(GameState gameState) {
        add(new GameplayArea(gameState));

        setSize(Sizing.WINDOW_DIMENSION);
        setBackground(ColorScheme.COLOR_FOUR);

        setTitle("Carbon Royale");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

//    public static void main(String[] args) {
//        EventQueue.invokeLater(() -> {
//            PlayGame playGame = new PlayGame(ga);
//            playGame.setVisible(true);
//        });
//    }
}
