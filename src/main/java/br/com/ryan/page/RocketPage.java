package br.com.ryan.page;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class RocketPage extends JFrame implements KeyListener {

    public RocketPage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);
        setVisible(true);

        addKeyListener (this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typpe: " + e.getKeyChar());

        switch (e.getKeyChar()) {
            case 'w':
            case 'a':
            case 's':
            case 'd':
                System.out.println("Type");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar());

        switch (e.getKeyCode()) {
            case 37:
            case 38:
            case 39:
            case 40:
                System.out.println("Value");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + e.getKeyChar());
    }
}