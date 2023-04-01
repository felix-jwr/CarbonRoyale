package org.example.game;

import org.example.ui.formatting.Sizing;

public class FireBullet extends Sprite {
    private final int BOARD_WIDTH = Sizing.WINDOW_WIDTH;
    private final int BULLET_SPEED = 2;

    public FireBullet(int x, int y) {
        super(x, y);

        fireBullet();
    }

    private void fireBullet() {
        loadImage("src/resources/playerbullet.png");
        getImageDimensions();
    }

    public void move() {
        x += BULLET_SPEED;

        if (x > BOARD_WIDTH) {
            visible = false;
        }
    }
}
