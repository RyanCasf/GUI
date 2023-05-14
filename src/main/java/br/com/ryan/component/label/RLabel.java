package br.com.ryan.component.label;

import br.com.ryan.layout.RColor;

import javax.swing.*;
import java.awt.*;

public class RLabel extends JLabel {

    public RLabel(final String TEXT) {
        setText(TEXT);
        setHorizontalAlignment(JLabel.CENTER);
        setVerticalAlignment(JLabel.CENTER);
        setForeground(RColor.WHITE);
    }
}