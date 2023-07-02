package br.com.ryan.panel;

import br.com.ryan.util.Config;
import br.com.ryan.util.Direction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class SnakePanel extends JPanel implements ActionListener {

    private final int[] axisX = new int[Config.GAME_UNITS];
    private final int[] axisY = new int[Config.GAME_UNITS];
    private int bodyParts = 2;
    private int applesEaten = 0;
    private int appleX;
    private int appleY;
    private Direction direction = Direction.RIGHT;
    private boolean running = false;
    private Timer timer;
    private final Random random;

    public SnakePanel() {
        random = new Random();
        setPreferredSize(new Dimension(Config.SCREEN_WIDTH, Config.SCREEN_HEIGHT));
        setBackground(Color.black);
        setFocusable(true);
        addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(Config.DELAY,this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if (!running) {
            gameOver(g);
            return;
        }

        g.setColor(Color.RED);
        g.fillOval(appleX, appleY, Config.UNIT_SIZE, Config.UNIT_SIZE);

        for (int i = 0; i < bodyParts; i++) {
            if (i == 0) {
                g.setColor(Config.COLOR_GREEN_HEADER);
                g.fillRect(axisX[i], axisY[i], Config.UNIT_SIZE, Config.UNIT_SIZE);
            } else {
                g.setColor(Config.COLOR_GREEN_TABLE_LIGHT);
                g.fillRect(axisX[i], axisY[i], Config.UNIT_SIZE, Config.UNIT_SIZE);
            }
        }

        g.setColor(Color.RED);
        g.setFont(Config.FONT_INK_FREE);
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString(getScore(), (Config.SCREEN_WIDTH - metrics.stringWidth(getScore()))/2, g.getFont().getSize());
    }

    public void newApple(){
        appleX = random.nextInt((Config.SCREEN_WIDTH/Config.UNIT_SIZE))*Config.UNIT_SIZE;
        appleY = random.nextInt((Config.SCREEN_HEIGHT/Config.UNIT_SIZE))*Config.UNIT_SIZE;
    }

    public void move(){
        for(int i = bodyParts;i>0;i--) {
            axisX[i] = axisX[i - 1];
            axisY[i] = axisY[i - 1];
        }

        switch(direction) {
            case TOP:
                axisY[0] = axisY[0] - Config.UNIT_SIZE;
                break;

            case BOTTOM:
                axisY[0] = axisY[0] + Config.UNIT_SIZE;
                break;

            case LEFT:
                axisX[0] = axisX[0] - Config.UNIT_SIZE;
                break;

            case RIGHT:
                axisX[0] = axisX[0] + Config.UNIT_SIZE;
                break;

            default:
                break;
        }
    }

    public void checkApple() {
        if((axisX[0] == appleX) && (axisY[0] == appleY)) {
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }

    public void checkCollisions() {
        for(int i = bodyParts;i>0;i--) {

            if((axisX[0] == axisX[i])&& (axisY[0] == axisY[i])) {
                running = false;
                break;
            }
        }

        if(axisX[0] < 0) {
            running = false;
        }

        if(axisX[0] > Config.SCREEN_WIDTH) {
            running = false;
        }

        if(axisY[0] < 0) {
            running = false;
        }

        if(axisY[0] > Config.SCREEN_HEIGHT) {
            running = false;
        }

        if(!running) {
            timer.stop();
        }
    }

    public void gameOver(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(Config.FONT_INK_FREE);
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString(getScore(), (Config.SCREEN_WIDTH - metrics1.stringWidth(getScore()))/2, g.getFont().getSize());
    }

    private String getScore() {
        return "Score: " + applesEaten;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(running) {
            move();
            checkApple();
            checkCollisions();
        }

        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            timer.start();

            switch(e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if(direction != Direction.RIGHT) {
                        direction = Direction.LEFT;
                    }
                    break;

                case KeyEvent.VK_RIGHT:
                    if(direction != Direction.LEFT) {
                        direction = Direction.RIGHT;
                    }
                    break;

                case KeyEvent.VK_UP:
                    if(direction != Direction.BOTTOM) {
                        direction = Direction.TOP;
                    }
                    break;

                case KeyEvent.VK_DOWN:
                    if(direction != Direction.TOP) {
                        direction = Direction.BOTTOM;
                    }
                    break;

                default:
                    break;
            }
        }
    }
}