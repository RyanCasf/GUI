package br.com.ryan.page;

import br.com.ryan.component.frame.RFrame;
import br.com.ryan.component.panel.RPanel;
import br.com.ryan.layout.RColor;

import java.awt.*;

public class NewPage {

    public NewPage() {
        RFrame frame = new RFrame();

        frame.add(new RPanel(RColor.PASTEL_RED), BorderLayout.CENTER);
    }
}