package org.example;

import org.example.ui.screens.landing.MainMenuButton;
import org.example.ui.formatting.Sizing;
import org.example.ui.screens.landing.GameTitleLabel;
import org.example.ui.screens.landing.MainMenuScreen;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame mainFrame;
        JPanel mainPanel;

        // Create a JFrame
        mainFrame = new JFrame("Swing Window Example");
        mainFrame.setSize(Sizing.WINDOW_DIMENSION);
        mainFrame.setMinimumSize(Sizing.WINDOW_DIMENSION);
        mainFrame.setMaximumSize(Sizing.WINDOW_DIMENSION);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make Main Menu
        mainPanel = new MainMenuScreen();

        // Create Carbon Royale Title
        mainPanel.add( Box.createRigidArea( new Dimension(0, 50) ));
        mainPanel.add(new GameTitleLabel());

        // Create MainMenuButtons
        Dimension buttonDistance = new Dimension(0, 15);
        mainPanel.add( Box.createRigidArea( buttonDistance ));
        mainPanel.add( new MainMenuButton("Start") );
        mainPanel.add( Box.createRigidArea( buttonDistance ));
        mainPanel.add( new MainMenuButton("Inventory") );
        mainPanel.add( Box.createRigidArea( buttonDistance ));
        mainPanel.add( new MainMenuButton("Quit") );

        // Show the frame
        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}