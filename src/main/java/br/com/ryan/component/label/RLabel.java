package br.com.ryan.component.label;

import javax.swing.*;
import java.awt.*;

public class RLabel extends JLabel {

    public RLabel(final String TEXT) {
        setText(TEXT);
        setHorizontalAlignment(JLabel.CENTER);
        setVerticalAlignment(JLabel.CENTER);
        setForeground(Color.WHITE);
    }
}