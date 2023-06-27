package br.com.ryan.action;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileChoose implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JFileChooser jFileChooser = new JFileChooser();
        int response = jFileChooser.showOpenDialog(null);

        if (response == JFileChooser.APPROVE_OPTION) {
            String DIRECTORY = jFileChooser.getSelectedFile().getAbsolutePath();
            System.out.println(DIRECTORY);
        }
    }
}