package br.com.ryan.home;

import br.com.ryan.component.frame.RFrame;
import br.com.ryan.component.label.RLabel;
import br.com.ryan.component.panel.RPanel;

public class GUI_Principal {

    public static void main(String[] args) {
        RFrame frame = new RFrame();

        RPanel panel0 = new RPanel(0);
        panel0.add(new RLabel("One"));

        RPanel panel1 = new RPanel(105);
        panel1.add(new RLabel("Two"));

        frame.add(panel0);
        frame.add(panel1);
    }
}