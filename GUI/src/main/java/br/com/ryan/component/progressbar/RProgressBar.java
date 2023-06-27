package br.com.ryan.component.progressbar;

import javax.swing.*;

public class RProgressBar extends JProgressBar {

    public RProgressBar(int value) {
        setValue(value);
        setStringPainted(true);
    }
}