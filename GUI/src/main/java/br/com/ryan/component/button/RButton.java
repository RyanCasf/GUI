package br.com.ryan.component.button;

import br.com.ryan.layout.RFonte;

import javax.swing.*;
import java.awt.event.ActionListener;

/*
    Button that executes somwthing when active one event
 */
public class RButton extends JButton {

    public RButton(final ActionListener actionListener, final String TITLE) {
        setText(TITLE);
        setVisible(true);
        setFocusable(true);
        setFont(RFonte.VERDANA);

        if (actionListener != null) {
            addActionListener(actionListener);
        }
    }
}