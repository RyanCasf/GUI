package br.com.ryan.component.textfield;

import javax.swing.*;
import java.awt.*;

public class RTextField extends JTextField {

    public RTextField() {
        setPreferredSize(new Dimension(20,20));
        setFont(new Font("Verdana", Font.PLAIN, 11));
    }
}