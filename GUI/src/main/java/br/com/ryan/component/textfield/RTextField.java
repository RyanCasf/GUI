package br.com.ryan.component.textfield;

import br.com.ryan.layout.RFonte;

import javax.swing.*;
import java.awt.*;

public class RTextField extends JTextField {

    public RTextField() {
        setPreferredSize(new Dimension(20,20));
        setFont(RFonte.VERDANA);
    }
}