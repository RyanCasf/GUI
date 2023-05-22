package br.com.ryan.page;

import br.com.ryan.action.ActionSystemPrintln;
import br.com.ryan.component.button.RButton;
import br.com.ryan.component.frame.RFrame;
import br.com.ryan.component.label.RLabel;
import br.com.ryan.component.panel.RPanel;
import br.com.ryan.layout.RColor;

import java.awt.*;

public class LaunchPage {

    public LaunchPage() {
        RFrame frame = new RFrame();

        RPanel panelTop = new RPanel(RColor.PASTEL_RED);
        panelTop.add(new RLabel("One"));
        panelTop.add(new RButton(new ActionSystemPrintln(), "Poo 1"));
        panelTop.add(new RButton(btn -> {frame.dispose(); new NewPage();}, "New Page"));
        panelTop.add(new RButton(new ActionSystemPrintln(), "Poo 3"));
        panelTop.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        RPanel panelCenter = new RPanel(RColor.WHITE);
        panelCenter.setLayout(new BorderLayout(10,10));
        panelCenter.add(new RPanel(RColor.DARK_GRAY, 50,50), BorderLayout.NORTH);
        panelCenter.add(new RPanel(RColor.PASTEL_ORANGE,50,50), BorderLayout.WEST);
        panelCenter.add(panelCenterGrid(), BorderLayout.CENTER);
        panelCenter.add(new RPanel(RColor.PASTEL_ORANGE,50,50), BorderLayout.EAST);
        panelCenter.add(new RPanel(RColor.DARK_GRAY,50,50), BorderLayout.SOUTH);

        frame.add(panelTop, BorderLayout.NORTH);
        frame.add(new RPanel(RColor.PASTEL_GREEN), BorderLayout.WEST);
        frame.add(panelCenter, BorderLayout.CENTER);
        frame.add(new RPanel(RColor.PASTEL_YELLOW), BorderLayout.EAST);
        frame.add(new RPanel(RColor.PASTEL_BLUE), BorderLayout.SOUTH);
    }

    private static RPanel panelCenterGrid() {
        RPanel panelCenterGrid  = new RPanel(RColor.PASTEL_PINK,50,50);
        panelCenterGrid.setLayout(new GridLayout(3,3, 2, 2));

        panelCenterGrid.add(new RButton(btn -> System.out.println("1"), "1"));
        panelCenterGrid.add(new RButton(btn -> System.out.println("2"), "2"));
        panelCenterGrid.add(new RButton(btn -> System.out.println("3"), "3"));
        panelCenterGrid.add(new RButton(btn -> System.out.println("4"), "4"));
        panelCenterGrid.add(new RButton(btn -> System.out.println("5"), "5"));
        panelCenterGrid.add(new RButton(btn -> System.out.println("6"), "6"));
        panelCenterGrid.add(new RButton(btn -> System.out.println("7"), "7"));
        panelCenterGrid.add(new RButton(btn -> System.out.println("8"), "8"));
        panelCenterGrid.add(new RButton(btn -> System.out.println("9"), "9"));

        return panelCenterGrid;
    }
}