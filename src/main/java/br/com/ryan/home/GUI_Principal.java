package br.com.ryan.home;

import br.com.ryan.action.ActionSystemPrintln;
import br.com.ryan.component.button.RButton;
import br.com.ryan.component.frame.RFrame;
import br.com.ryan.component.label.RLabel;
import br.com.ryan.component.panel.RPanel;

public class GUI_Principal {

    public static void main(String[] args) {
        RFrame frame = new RFrame();

        RPanel panel0 = new RPanel(0);
        panel0.add(new RLabel("One"));

        RPanel panel1 = new RPanel(105);
        RButton button0 = new RButton(new ActionSystemPrintln(), "Poo");
        panel1.add(button0);

        RPanel panel2 = new RPanel(210);
        panel2.add(new RLabel("Three"));

        RPanel panel3 = new RPanel(315);
        panel3.add(new RLabel("Four"));

        frame.add(panel0);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
    }
}