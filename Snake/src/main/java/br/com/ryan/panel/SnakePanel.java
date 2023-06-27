package br.com.ryan.panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class SnakePanel extends JPanel {

    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HEIGHT = 600;
    private static final int UNIT_SIZE = 25;
    private static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    private static final int DELAY = 75;

    private final int[] x = new int[GAME_UNITS];
    private final int[] y = new int[GAME_UNITS];
    private int bodyParts = 6;
    private int applesEaten = 0;
    private int appleX;
    private int appleY;
    private char direction = 'R';
    private boolean running = false;
    private Timer timer;
    private Random random;

    public SnakePanel() {
        setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(new SnakeKeyAdapter());

        startGame();
    }

    public void startGame() {

    }

    public void paintComponent(Graphics g) {

    }

    public void draw(Graphics g) {

    }

    public void newApple() {

    }

    public void move() {

    }

    public void checkAppple() {

    }

    public void checkCollisions() {

    }

    public void gameOver() {

    }

    public class SnakeKeyAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent event) {

        }
    }
}