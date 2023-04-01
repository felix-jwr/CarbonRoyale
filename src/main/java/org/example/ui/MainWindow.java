package org.example.ui;

import org.example.ui.formatting.Sizing;

import javax.swing.*;

public class MainWindow  extends JFrame {
    public MainWindow(){
        setTitle("Carbon Royale");
        setSize(Sizing.WINDOW_DIMENSION);
        setMinimumSize(Sizing.WINDOW_DIMENSION);
        setMaximumSize(Sizing.WINDOW_DIMENSION);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
