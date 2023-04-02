package org.example;

import org.example.game.GameState;
import org.example.ui.MainWindow;
import org.example.ui.actions.*;
import org.example.ui.screens.landing.*;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        GameState gameState = new GameState();
        MainWindow mainFrame = new MainWindow();
        MainMenuScreen mainPanel = new MainMenuScreen(gameState);

        makeInterfaceCrossPlatform();

        // Create Carbon Royale Title
        mainPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        mainPanel.add(new GameTitleLabel());
        createMenuButtons(mainFrame, mainPanel);

        // Show the frame
        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    private static void makeInterfaceCrossPlatform() {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createMenuButtons(JFrame mainFrame, MainMenuScreen mainPanel) {
        // Create Actions for Buttons
        StartGameAction startGameAction = new StartGameAction(mainFrame, mainPanel);
        InventoryAction inventoryAction = new InventoryAction(mainFrame, mainPanel);
        QuitGameAction quitGameAction = new QuitGameAction();

        // Create MainMenuButtons
        Dimension buttonDistance = new Dimension(0, 15);
        mainPanel.add( Box.createRigidArea( buttonDistance ));
        mainPanel.add( new MainMenuButton("Start", startGameAction) );
        mainPanel.add( Box.createRigidArea( buttonDistance ));
        mainPanel.add( new MainMenuButton("Inventory", inventoryAction) );
        mainPanel.add( Box.createRigidArea( buttonDistance ));
        mainPanel.add( new MainMenuButton("Quit", quitGameAction) );

        // Show the frame and centre the window
        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }
}