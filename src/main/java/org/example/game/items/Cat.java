package org.example.game.items;

import javax.swing.*;

public class Cat implements Item{
    @Override
    public ImageIcon getImageIcon() {
        return new ImageIcon("src/resources/yeat_cat.png");
    }
}
