package br.com.ryan.page;

import br.com.ryan.component.frame.RFrame;
import br.com.ryan.component.label.RLabel;
import br.com.ryan.layout.RColor;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerPage implements MouseListener {

    private RFrame frame = new RFrame();
    private RLabel label = new RLabel("Mouse Clicked");

    public MouseListenerPage() {
        label.setBounds(0,0,100,100);
        label.setBackground(RColor.BLACK);
        label.addMouseListener(this);
        frame.add(label);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
        label.setBackground(RColor.PASTEL_BLUE);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Presseded");
        label.setBackground(RColor.PASTEL_ORANGE);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Releaseded");
        label.setBackground(RColor.PASTEL_RED);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entereded");
        label.setBackground(RColor.PASTEL_GREEN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exiteded");
        label.setBackground(RColor.PASTEL_YELLOW);
    }
}