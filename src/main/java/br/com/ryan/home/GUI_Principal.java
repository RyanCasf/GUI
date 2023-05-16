package br.com.ryan.home;

import br.com.ryan.action.ActionSystemPrintln;
import br.com.ryan.component.button.RButton;
import br.com.ryan.component.frame.RFrame;
import br.com.ryan.component.label.RLabel;
import br.com.ryan.component.panel.RPanel;
import br.com.ryan.layout.RColor;

import java.awt.*;

public class GUI_Principal {

    public static void main(String[] args) {
        RFrame frame = new RFrame();

        RPanel panelTop = new RPanel(RColor.PASTEL_RED);
        panelTop.add(new RLabel("One"));
        panelTop.add(new RButton(new ActionSystemPrintln(), "Poo 1"));
        panelTop.add(new RButton(new ActionSystemPrintln(), "Poo 2"));
        panelTop.add(new RButton(new ActionSystemPrintln(), "Poo 3"));
        panelTop.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        RPanel panelCenter = new RPanel(RColor.WHITE);
        panelCenter.setLayout(new BorderLayout(10,10));
        panelCenter.add(new RPanel(RColor.DARK_GRAY, 50,50), BorderLayout.NORTH);
        panelCenter.add(new RPanel(RColor.PASTEL_ORANGE,50,50), BorderLayout.WEST);
        panelCenter.add(new RPanel(RColor.PASTEL_PINK,50,50), BorderLayout.CENTER);
        panelCenter.add(new RPanel(RColor.PASTEL_ORANGE,50,50), BorderLayout.EAST);
        panelCenter.add(new RPanel(RColor.DARK_GRAY,50,50), BorderLayout.SOUTH);

        frame.add(panelTop, BorderLayout.NORTH);
        frame.add(new RPanel(RColor.PASTEL_GREEN), BorderLayout.WEST);
        frame.add(panelCenter, BorderLayout.CENTER);
        frame.add(new RPanel(RColor.PASTEL_YELLOW), BorderLayout.EAST);
        frame.add(new RPanel(RColor.PASTEL_BLUE), BorderLayout.SOUTH);
    }
}