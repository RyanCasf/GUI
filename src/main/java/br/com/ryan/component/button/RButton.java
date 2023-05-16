package br.com.ryan.component.button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/*
    Button that executes somwthing when active one event
 */
public class RButton extends JButton {

    public RButton(final ActionListener actionListener, final String TITLE) {
        setText(TITLE);
        setVisible(true);
        setFocusable(true);
        setFont(new Font("Verdana", Font.PLAIN, 10));

        if (actionListener != null) {
            addActionListener(actionListener);
        }
    }
}