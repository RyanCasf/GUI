package br.com.ryan.action;

import br.com.ryan.layout.RColor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChoose implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        System.out.println("Teste...");

        JColorChooser jColorChooser = new JColorChooser();
        Color color = JColorChooser.showDialog(null, "Pick a color", RColor.WHITE);
    }
}