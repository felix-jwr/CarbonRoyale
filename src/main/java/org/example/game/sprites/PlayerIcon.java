package org.example.game.sprites;

import org.example.game.GameState;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class PlayerIcon extends Sprite {
    private int dx;
    private int dy;
    private List<FireBullet> bullets;

    public PlayerIcon(int x, int y, GameState gameState) {
        super(x, y);
        setupPlayer(gameState);
    }

    private void setupPlayer(GameState gameState) {
        bullets = new ArrayList<>();
//        if (gameState.getActiveInventory().getItemList().contains()) {
//
//        }
        loadImage("src/resources/player.png");
        getImageDimensions();
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public List<FireBullet> getBullets() {
        return bullets;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
            fire();
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
    }

    public void fire() {
        bullets.add(new FireBullet(x + width, y + (height / 2) - 5));
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}