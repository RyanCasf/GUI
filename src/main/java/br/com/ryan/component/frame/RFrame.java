package br.com.ryan.component.frame;

import javax.swing.*;
import java.awt.*;

public class RFrame extends JFrame {

    public RFrame() {
        setVisible(true);
        setSize(500, 500);
        setTitle("JFrame");
        setResizable(false);

        setLayout(new BorderLayout(10,10));
        getContentPane().setBackground(Color.WHITE); // change color of backgroung
        setDefaultCloseOperation(EXIT_ON_CLOSE); // exit out of application
    }
}