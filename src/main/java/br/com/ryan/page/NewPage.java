package br.com.ryan.page;

import br.com.ryan.component.button.RButton;
import br.com.ryan.component.checkbox.RCheckBox;
import br.com.ryan.component.frame.RFrame;
import br.com.ryan.component.panel.RPanel;
import br.com.ryan.layout.RColor;

import java.awt.*;

public class NewPage {

    public NewPage() {
        RFrame frame = new RFrame();

        frame.add(panelTop(), BorderLayout.NORTH);
    }

    private RPanel panelTop() {
        RPanel temp = new RPanel(RColor.WHITE);
        temp.setLayout(new GridLayout(1, 2, 2, 2));

        temp.add(new RCheckBox("I'm not a robot."));
        temp.add(new RButton(btn -> {
            System.out.println(((RCheckBox) temp.getComponent(0)).isSelected());
        }, "Enviar"));

        return temp;
    }
}