package org.example.ui.screens.gameplay;

import org.example.game.sprites.Enemy;
import org.example.game.sprites.FireBullet;
import org.example.game.GameState;
import org.example.game.sprites.PlayerIcon;
import org.example.ui.MainWindow;
import org.example.ui.formatting.ColorScheme;
import org.example.ui.formatting.Fonts;
import org.example.ui.formatting.Sizing;
import org.example.ui.screens.CustomScreen;
import org.example.ui.screens.landing.GameTitleLabel;
import org.example.ui.screens.landing.MainMenuScreen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.*;

public class GameplayArea extends CustomScreen implements ActionListener {
    private final int ICRAFT_X = 40;
    private final int ICRAFT_Y = 60;
    private final int DELAY = 10;
    private final int KILLS_TO_WIN = 1;
    private Timer timer;
    private boolean ingame;
    private PlayerIcon player;
    private List<Enemy> enemies;
    private int kills = 0;
    private boolean win;

    public GameplayArea(GameState gameState) {
        super(gameState);
    }

    private void startGame() {
        addKeyListener(new TAdapter());
        setBackground(ColorScheme.COLOR_FOUR);
        setFocusable(true);
        ingame = true;

        player = new PlayerIcon(ICRAFT_X, ICRAFT_Y);

        initEnemies();

        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void initEnemies() {
        enemies = new ArrayList<>();
        int x, y;

        for(int i = 0; i < 15; i++) {
            x = ThreadLocalRandom.current().nextInt(Sizing.WINDOW_WIDTH / 2, Sizing.WINDOW_WIDTH
                    + player.getWidth());
            y = ThreadLocalRandom.current().nextInt(5, Sizing.WINDOW_HEIGHT - player.getHeight());

            enemies.add(new Enemy(x, y));
        }
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        if (ingame) {
            drawSprites(graphics);
        } else if (!win) {
            drawGameOver(graphics);
        }
        else {
            drawWin();
        }

        Toolkit.getDefaultToolkit().sync();
    }

    private void drawSprites(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;

        if (player.isVisible()) {
            graphics2D.drawImage(player.getImage(), player.getX(),
                    player.getY(), this);

        }

        List<FireBullet> bullets = player.getBullets();

        for (FireBullet bullet : bullets) {
            graphics2D.drawImage(bullet.getImage(), bullet.getX(),
                    bullet.getY(), this);
        }

        for (Enemy enemy : enemies) {
            if (enemy.isVisible()) {
                graphics2D.drawImage(enemy.getImage(), enemy.getX(), enemy.getY(),
                this);
            }
        }

        graphics.setColor(ColorScheme.COLOR_ONE);
        graphics.setFont(Fonts.ENEMIES_LEFT);
        graphics.drawString("Enemies left: " + (KILLS_TO_WIN - kills), 5,
                getFontMetrics(Fonts.ENEMIES_LEFT).getHeight() - 5);
    }

    private void drawGameOver(Graphics graphics) {
        String message = "You Got Polluted!!!!!!";
        FontMetrics fontMetrics = getFontMetrics(Fonts.GAME_OVER);

        graphics.setColor(ColorScheme.COLOR_FIVE);
        graphics.setFont(Fonts.GAME_OVER);
        graphics.drawString(message, (Sizing.WINDOW_WIDTH - fontMetrics.stringWidth(message)) / 2,
        (Sizing.WINDOW_HEIGHT / 2));
    }

    private void drawWin() {
        // Get rid of old frame
        JFrame frame = (JFrame) getTopLevelAncestor();
        frame.dispose();

//        JFrame newFrame = new JFrame();
//
//        newFrame.setMinimumSize(Sizing.WINDOW_DIMENSION);
//        newFrame.setMinimumSize(Sizing.WINDOW_DIMENSION);
//        Loot lootScreen = new Loot(getGameState());
//
//        // Create Carbon Royale Title
//        lootScreen.add(Box.createRigidArea(new Dimension(0, 50)));
//        LootTitleLabel lootTitleLabel = new LootTitleLabel();
//        lootTitleLabel.setAlignmentX(400);
//        lootScreen.add(lootTitleLabel);
//
//        newFrame.add(lootScreen);
//        newFrame.pack();
//        newFrame.setLocationRelativeTo(null);
//        newFrame.setVisible(true);
//
        MainWindow newFrame = new MainWindow();
        Loot lootPanel = new Loot(getGameState());

//        makeInterfaceCrossPlatform();

        // Create Carbon Royale Title
        lootPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        lootPanel.add(new GameTitleLabel());
//        createMenuButtons(mainFrame, mainPanel);

        // Show the frame
        newFrame.add(lootPanel);
        newFrame.pack();
        newFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        inGame();

        checkForWin();
        updatePlayer();
        updateBullets();
        updateEnemies();
        checkCollisions();

        repaint();
    }

    private void checkForWin() {
        if (kills >= KILLS_TO_WIN) {
            ingame = false;
            win = true;
        } else if (kills < KILLS_TO_WIN && enemies.size() == 0) {
            initEnemies();
        }
    }

    private void inGame() {
        if (!ingame) {
            timer.stop();
        }
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
        if (player.isVisible()) {
            player.move();
        }
    }

    private void updateEnemies() {
        if (enemies.isEmpty()) {
            ingame = false;
            return;
        }

        for (int i = 0; i < enemies.size(); i++) {
            Enemy e = enemies.get(i);

            if (e.isVisible()) {
                e.move();
            } else {
                enemies.remove(i);
            }
        }
    }

    public void checkCollisions() {
        Rectangle r3 = player.getBounds();

        for (Enemy e : enemies) {
            Rectangle r2 = e.getBounds();

            if (r3.intersects(r2)) {
                player.setVisible(false);
                e.setVisible(false);
                ingame = false;
            }
        }

        List<FireBullet> bullets = player.getBullets();

        for (FireBullet b : bullets) {
            Rectangle r1 = b.getBounds();

            for (Enemy e : enemies) {
                Rectangle r2 = e.getBounds();

                if (r1.intersects(r2)) {
                    b.setVisible(false);
                    e.setVisible(false);
                    kills += 1;
                }
            }
        }
    }

    @Override
    protected void setupScreen() {
        startGame();
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