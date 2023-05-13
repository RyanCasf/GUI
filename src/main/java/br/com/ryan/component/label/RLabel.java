package br.com.ryan.component.label;

import javax.swing.*;
import java.awt.*;

public class RLabel extends JLabel {

    public RLabel() {
        setText("Do you want?");
        setHorizontalAlignment(JLabel.CENTER);
        setVerticalAlignment(JLabel.CENTER);
        setForeground(Color.WHITE);
    }
}