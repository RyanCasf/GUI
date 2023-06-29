package br.com.ryan.panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        newApple();
        running = true;

        timer = new Timer(DELAY, new SnakeActionListener());
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        final int BLOCK_HEIGHT = SCREEN_HEIGHT / UNIT_SIZE;
        for (int i=0; i<BLOCK_HEIGHT; i++) {
            final int GAP = i*UNIT_SIZE;
            g.drawLine(GAP, 0, GAP, SCREEN_HEIGHT);
        }

        final int BLOCK_WIDTH = SCREEN_WIDTH / UNIT_SIZE;
        for (int i=0; i<BLOCK_WIDTH; i++) {
            final int GAP = i*UNIT_SIZE;
            g.drawLine(0, GAP, SCREEN_WIDTH, GAP);
        }

        g.setColor(Color.RED);
        g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

        for (int i=0; i<bodyParts; i++) {
            if (i == 0) {
                g.setColor(Color.GREEN);
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
            }
            else {
                g.setColor(new Color(45, 180, 0));
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
            }
        }
    }

    public void newApple() {
        Random random = new Random();
        appleX = random.nextInt(SCREEN_WIDTH / UNIT_SIZE) * UNIT_SIZE;
        appleY = random.nextInt(SCREEN_HEIGHT / UNIT_SIZE) * UNIT_SIZE;
    }

    public void move() {
        for (int i=bodyParts; i>0; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }

        switch (direction) {
            case 'U':
                y[0] = y[0] - UNIT_SIZE;
                break;

            case 'D':
                y[0] = y[0] + UNIT_SIZE;
                break;

            case 'R':
                x[0] = x[0] - UNIT_SIZE;
                break;

            case 'L':
                x[0] = x[0] + UNIT_SIZE;
                break;

            default:
                System.err.println("Error direction!");
        }
    }

    public void checkAppple() {

    }

    public void checkCollisions() {
        for (int i=bodyParts; i>0; i--) {
            if (x[0] == x[i] && x[i] == y[0]) {
                running = false;
            }
        }

        if (x[0] < 0) {
            running = false;
        }

        if (x[0] > SCREEN_WIDTH) {
            running = false;
        }

        if (y[0] < 0) {
            running = false;
        }

        if (y[0] > SCREEN_HEIGHT) {
            running = false;
        }

        if (!running == false) {
            timer.stop();
        }
    }

    public void gameOver() {

    }

    public class SnakeActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (running) {
                move();

                checkAppple();
                checkCollisions();
            }

            repaint();
        }
    }

    public class SnakeKeyAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent event) {
            switch (event.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;

                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;

                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;

                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;

                default:
                    break;
            }
        }
    }
}