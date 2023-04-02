package org.example.game.sprites;

import org.example.game.sprites.Sprite;
import org.example.ui.formatting.Sizing;

public class Enemy extends Sprite {
    private final int INITIAL_X = Sizing.WINDOW_WIDTH / 2;

    public Enemy(int x, int y) {
        super(x, y);
        createEnemy();
    }

    private void createEnemy() {
        loadImage("src/resources/enemy.png");
        getImageDimensions();
    }

    public void move() {
        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }
}
