package br.com.ryan.component.panel;

import javax.swing.*;
import java.awt.*;

/*
    GUI component that functions as a container to hold other components
 */
public class RPanel extends JPanel {

    public RPanel(final Color COLOR, final int WIDTH, final int HEIGHT) {
        this();
        setBackground(COLOR);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public RPanel(final Color COLOR) {
        this();
        setBackground(COLOR);
        setPreferredSize(new Dimension(100, 100));
    }

    private RPanel() {
        setVisible(true);
    }
}