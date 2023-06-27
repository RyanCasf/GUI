package br.com.ryan.frame;

import br.com.ryan.panel.SnakePanel;

import javax.swing.*;

public class SnakeFrame extends JFrame {

    public SnakeFrame() {
        SnakePanel snakePanel = new SnakePanel();
        add(snakePanel);

        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }
}