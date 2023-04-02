package org.example.game.items;

import javax.swing.*;

public class Cat implements Item{
    @Override
    public ImageIcon getImageIcon() {
        return new ImageIcon("src/resources/yeat_cat.png");
    }

    @Override
    public String getImagePath() {
        return "src/resources/yeat_cat.png";
    }
}
