package br.com.ryan.frame;

import br.com.ryan.panel.SwitchPanel;

import javax.swing.*;

public class SwitchFrame extends JFrame {

    public SwitchFrame() {
        SwitchPanel switchPanel = new SwitchPanel();
        add(switchPanel);

        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }
}
