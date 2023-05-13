package br.com.ryan.component.frame;

import javax.swing.*;
import java.awt.*;

public class RFrame extends JFrame {

    public RFrame() {
        setVisible(true);
        setSize(420, 420);
        setTitle("JFrame");
        setResizable(false);

        setLayout(null);
        getContentPane().setBackground(new Color(123, 50, 250)); // change color of backgroung
        setDefaultCloseOperation(EXIT_ON_CLOSE); // exit out of application
    }
}