package org.example.game;

import org.example.ui.formatting.ColorScheme;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameplayArea extends JPanel implements ActionListener {
    private final int ICRAFT_X = 40;
    private final int ICRAFT_Y = 60;
    private final int DELAY = 10;
    private Timer timer;
    private PlayerIcon player;

    public GameplayArea() {
        startGame();
    }

    private void startGame() {
        addKeyListener(new TAdapter());
        setBackground(ColorScheme.COLOR_FOUR);
        setFocusable(true);

        player = new PlayerIcon(ICRAFT_X, ICRAFT_Y);

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        drawSprites(graphics);
        Toolkit.getDefaultToolkit().sync();
    }

    private void drawSprites(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;

        graphics2D.drawImage(player.getImage(), player.getX(),
                player.getY(), this);

        List<FireBullet> bullets = player.getBullets();

        for (FireBullet bullet : bullets) {
            graphics2D.drawImage(bullet.getImage(), bullet.getX(),
                    bullet.getY(), this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateBullets();
        updatePlayer();
        repaint();
    }

    private void updateBullets() {
        List<FireBullet> bullets = player.getBullets();

        for (int i = 0; i < bullets.size(); i++) {
            FireBullet bullet = bullets.get(i);

            if (bullet.isVisible()) {
                bullet.move();
            } else {
                bullets.remove(i);
            }
        }
    }

    private void updatePlayer() {
        player.move();
    }

    private class TAdapter extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }
    }
}