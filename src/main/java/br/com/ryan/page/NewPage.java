package br.com.ryan.page;

import br.com.ryan.component.button.RButton;
import br.com.ryan.component.checkbox.RCheckBox;
import br.com.ryan.component.combobox.RComboBox;
import br.com.ryan.component.frame.RFrame;
import br.com.ryan.component.panel.RPanel;
import br.com.ryan.component.progressbar.RProgressBar;
import br.com.ryan.component.radiobutton.RRadioButton;
import br.com.ryan.component.slider.RSlider;
import br.com.ryan.layout.RColor;

import javax.swing.*;
import java.awt.*;

public class NewPage {

    private RFrame frame= new RFrame();
    private RProgressBar progressBar = new RProgressBar(0);

    public NewPage() {
        frame.add(panelTop(), BorderLayout.NORTH);
        frame.add(panelOeste(), BorderLayout.WEST);
        frame.add(panelCenter(), BorderLayout.CENTER);
        frame.add(panelLeste(), BorderLayout.EAST);
        frame.add(panelBottom(), BorderLayout.SOUTH);
    }

    private RPanel panelTop() {
        RPanel temp = new RPanel(RColor.PASTEL_GREEN);
        temp.add(progressBar);

        return temp;
    }

    private RPanel panelOeste() {
        RPanel temp = new RPanel(RColor.PASTEL_YELLOW);

        RSlider slider = new RSlider(SwingConstants.VERTICAL, 0, 100, 50, 10, 25);

        temp.add(slider);

        return temp;
    }

    private RPanel panelCenter() {
        RPanel temp = new RPanel(RColor.PASTEL_BLUE);

        RComboBox comboBox = new RComboBox();
        comboBox.addItem("Top");
        comboBox.addItem(("Mid"));
        comboBox.addItem(("Bot"));

        temp.add(comboBox);

        return temp;
    }

    private RPanel panelLeste() {
        RPanel temp = new RPanel(RColor.WHITE);
        temp.setLayout(new GridLayout(2, 1, 2, 2));

        temp.add(new RCheckBox("I'm not a robot."));
        temp.add(new RButton(btn -> {
            System.out.println(((RCheckBox) temp.getComponent(0)).isSelected());
        }, "Enviar"));

        return temp;
    }

    private RPanel panelBottom() {
        RPanel temp = new RPanel(RColor.PASTEL_ORANGE);
        temp.setLayout(new GridLayout(1,3,2,2));

        RRadioButton radioOne = new RRadioButton("Option One");
        RRadioButton radioTwo = new RRadioButton("Option Two");
        RRadioButton radioThree = new RRadioButton("Option Three");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioOne);
        buttonGroup.add(radioTwo);
        buttonGroup.add(radioThree);

        temp.add(radioOne);
        temp.add(radioTwo);
        temp.add(radioThree);

        return temp;
    }
}