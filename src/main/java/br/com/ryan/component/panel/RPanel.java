package br.com.ryan.component.panel;

import javax.swing.*;
import java.awt.*;

/*
    GUI component that functions as a container to hold other components
 */
public class RPanel extends JPanel {

    public RPanel(final int Y) {
        setBounds(0, Y, 420,105);
        setBackground(Color.black);
        setVisible(true);
    }
}