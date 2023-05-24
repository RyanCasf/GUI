package br.com.ryan.component.checkbox;

import javax.swing.*;
import java.awt.*;

public class RCheckBox extends JCheckBox {

    public RCheckBox(final String TEXT) {
        setText(TEXT);
        setFocusable(false);
        setFont(new Font("Verdana", Font.PLAIN, 11));
        setBackground(null);
    }
}