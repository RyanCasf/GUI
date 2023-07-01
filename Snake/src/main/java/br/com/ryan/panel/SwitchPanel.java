package br.com.ryan.panel;

import javax.swing.*;
import java.awt.*;

public class SwitchPanel extends JPanel {

    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HEIGHT = 600;

    public SwitchPanel() {
        setVisible(true);
        setFocusable(true);
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(new Font("Ink Free", Font.BOLD, 75));

        FontMetrics metrics2 = getFontMetrics(g.getFont());
        int positionX = (SCREEN_WIDTH - metrics2.stringWidth("Snake Game")) / 2;
        g.drawString("Snake Game", positionX, SCREEN_HEIGHT / 2);
    }
}