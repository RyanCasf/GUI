package br.com.ryan.component.checkbox;

import br.com.ryan.layout.RFonte;

import javax.swing.*;

public class RCheckBox extends JCheckBox {

    public RCheckBox(final String TEXT) {
        setText(TEXT);
        setFocusable(false);
        setFont(RFonte.VERDANA);
        setBackground(null);
    }
}