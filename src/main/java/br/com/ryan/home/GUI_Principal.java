package br.com.ryan.home;

import br.com.ryan.action.ActionSystemPrintln;
import br.com.ryan.component.button.RButton;
import br.com.ryan.component.frame.RFrame;
import br.com.ryan.component.label.RLabel;
import br.com.ryan.component.panel.RPanel;

import java.awt.*;

public class GUI_Principal {

    public static void main(String[] args) {
        RFrame frame = new RFrame();

        RPanel panelTop = new RPanel(Color.RED);
        panelTop.add(new RLabel("One"));
        panelTop.add(new RButton(new ActionSystemPrintln(), "Poo"));

        RPanel panelCenter = new RPanel(Color.WHITE);
        panelCenter.setLayout(new BorderLayout(10,10));
        panelCenter.add(new RPanel(Color.DARK_GRAY, 50,50), BorderLayout.NORTH);
        panelCenter.add(new RPanel(Color.ORANGE,50,50), BorderLayout.WEST);
        panelCenter.add(new RPanel(Color.PINK,50,50), BorderLayout.CENTER);
        panelCenter.add(new RPanel(Color.ORANGE,50,50), BorderLayout.EAST);
        panelCenter.add(new RPanel(Color.DARK_GRAY,50,50), BorderLayout.SOUTH);

        frame.add(panelTop, BorderLayout.NORTH);
        frame.add(new RPanel(Color.GREEN), BorderLayout.WEST);
        frame.add(panelCenter, BorderLayout.CENTER);
        frame.add(new RPanel(Color.YELLOW), BorderLayout.EAST);
        frame.add(new RPanel(Color.BLUE), BorderLayout.SOUTH);
    }
}