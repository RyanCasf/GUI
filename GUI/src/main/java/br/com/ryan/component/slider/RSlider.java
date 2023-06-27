package br.com.ryan.component.slider;

import br.com.ryan.layout.RFonte;

import javax.swing.*;

public class RSlider extends JSlider {

    public RSlider(int referencia, int min, int max, int beg, int sGap, int lgap) {
        super(referencia, min, max, beg);

        setPaintLabels(true);

        setPaintTicks(true);
        setMinorTickSpacing(sGap);

        setPaintTrack(true);
        setMajorTickSpacing(sGap);

        setFont(RFonte.VERDANA);
    }
}